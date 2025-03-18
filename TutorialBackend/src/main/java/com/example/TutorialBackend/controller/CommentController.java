package com.example.TutorialBackend.controller;

import com.example.TutorialBackend.exception.ResourceNotFoundException;
import com.example.TutorialBackend.model.Comment;
import com.example.TutorialBackend.model.Tutorial;
import com.example.TutorialBackend.model.TutorialDetails;
import com.example.TutorialBackend.repository.CommentRepository;
import com.example.TutorialBackend.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentController {


    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private TutorialRepository tutorialRepository;

    @PostMapping("/tutorials/{tutorialId}/comment")
    public ResponseEntity<Comment> createComment(@PathVariable(value = "tutorialId") long tutorialId,
                                                 @RequestBody Comment commentRequest) throws ResourceNotFoundException {
        Comment comment = tutorialRepository.findById(tutorialId).map(tutorial -> {
            commentRequest.setTutorial(tutorial);
            return commentRepository.save(commentRequest);
        }).orElseThrow(() ->
                new ResourceAccessException("No tutorial found with id: " + tutorialId));
        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }

    @GetMapping("/tutorials/{tutorialId}/comments")
    public ResponseEntity<List<Comment>> getAllCommentsByTutorialId(
            @PathVariable(value = "tutorialId") long tutorialId) throws ResourceNotFoundException {
        if(!tutorialRepository.existsById(tutorialId)){
            throw new ResourceNotFoundException("No tutorial found with id: " + tutorialId);
        }
        List<Comment> comments = commentRepository.findByTutorialId(tutorialId);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }

    @GetMapping("/comments/{id}")
    public ResponseEntity<Comment> getCommentByTutorialId(
            @PathVariable(value = "id") long id) throws ResourceNotFoundException {
        Comment comment = commentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("No tutorial found with id: " + id));
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @PutMapping("/comments/{id}")
    public ResponseEntity<Comment> updateComment(@PathVariable(value = "id") long id,
                                                 @RequestBody Comment commentRequest)
            throws ResourceNotFoundException {
        Comment comment = commentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("No tutorial found with id: " + id));
        comment.setContent(commentRequest.getContent());
        return new ResponseEntity<>(commentRepository.save(comment),HttpStatus.OK);

    }

    @DeleteMapping("/comments/{id}")
    public ResponseEntity<Comment> deleteComment(@PathVariable("id") long id){
        commentRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/tutorials/{tutorialId}/comments")
    public ResponseEntity<Comment> deleteAllCommentsOfTutorial(@PathVariable("tutorialId") long tutorialId)
            throws ResourceNotFoundException {
        if(!tutorialRepository.existsById(tutorialId)){
            throw new ResourceNotFoundException("No tutorial found with id: " + tutorialId);
        }
        commentRepository.deleteByTutorialId(tutorialId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
