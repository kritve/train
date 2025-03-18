package com.example.TutorialBackend.controller;

import com.example.TutorialBackend.exception.ResourceNotFoundException;
import com.example.TutorialBackend.model.Tag;
import com.example.TutorialBackend.model.Tutorial;
import com.example.TutorialBackend.repository.TagRepository;
import com.example.TutorialBackend.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api")
public class TagController {

    @Autowired
    private TutorialRepository tutorialRepository ;

    @Autowired
    private TagRepository tagRepository ;

    @PostMapping("/tutorials/{tutorialId}/tags")
    public ResponseEntity<Tag> addTag(
            @PathVariable("tutorialId") long tutorialId ,
            @RequestBody Tag tagRequest
    ){

        Tag tag = tutorialRepository.findById(tutorialId)
                .map( tutorial -> {
                    tutorial.addTags(tagRequest);
                    return tagRepository.save(tagRequest);
                })
                .orElseThrow(
                        ()->new ResourceNotFoundException("No Tutorial found with ID :" + tutorialId)
                );

        return new ResponseEntity<>(tag , HttpStatus.CREATED);
    }

    @GetMapping("/tags")
    public ResponseEntity<List<Tag>> getAllTags(){
        List<Tag> tags = new ArrayList<>();
        tagRepository.findAll().forEach(tags::add);
        if(tags.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(tags, HttpStatus.OK);
    }

    @GetMapping("/tutorials/{tutorialId}/tags")
    public ResponseEntity<List<Tag>> getAllTagsByTutorialId(@PathVariable(value = "tutorialId")
                                                            long tutorialId) throws ResourceNotFoundException {
        if(!tutorialRepository.existsById(tutorialId)){
            throw new ResourceNotFoundException("No tutorial found with id: " + tutorialId);
        }
        List<Tag> tags = tagRepository.findTagsByTutorialsId(tutorialId);
        return new ResponseEntity<>(tags, HttpStatus.OK);
    }


    @GetMapping("tags/{id}")
    public ResponseEntity<Tag> getTagsById(@PathVariable(value = "id") long id) throws ResourceNotFoundException {
        Tag tag = tagRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("No tutorial found with id: " + id));

        return new ResponseEntity<>(tag, HttpStatus.OK);
    }


    @GetMapping("tags/{id}/tutorials")
    public ResponseEntity<List<Tutorial>> getAllTutorialsByTagId(
            @PathVariable(value = "tagId") long tagId) throws ResourceNotFoundException {
        if(!tutorialRepository.existsById(tagId)){
            throw new ResourceNotFoundException("No tutorial found with id: " + tagId);
        }
        List<Tutorial> tutorials= tutorialRepository.findTutorialsByTagsId(tagId);
        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }

    @PutMapping("tags/{id}")
    public ResponseEntity<Tag> updateTagsById(@PathVariable(value = "id") long id,
                                              @RequestBody Tag tagRequest) throws ResourceNotFoundException {
        Tag tag = tagRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Tag with id:" + id + "not found"));
        tag.setName(tagRequest.getName());
        return new ResponseEntity<>(tagRepository.save(tag), HttpStatus.OK);
    }



}