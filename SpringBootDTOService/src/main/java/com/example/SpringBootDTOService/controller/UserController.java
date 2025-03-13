package com.example.SpringBootDTOService.controller;

import com.example.SpringBootDTOService.dto.UserDTO;
import com.example.SpringBootDTOService.entity.User;
import com.example.SpringBootDTOService.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody UserDTO userDTO){
        Map<String, Object> jsonResponseMap = new LinkedHashMap<>();
        User user = modelMapper.map(userDTO, User.class);
        userService.save(user);
        jsonResponseMap.put("status", 1);
        jsonResponseMap.put("message", "Record is saved successfully!");
        return new ResponseEntity<>(jsonResponseMap, HttpStatus.CREATED);
    }


}
