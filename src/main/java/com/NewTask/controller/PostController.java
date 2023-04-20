package com.NewTask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NewTask.dto.PostDto;
import com.NewTask.services.PostService;


@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/{id}")
    public ResponseEntity<List<PostDto>> getPostsById(@PathVariable Integer id)
    {
         return ResponseEntity.status(HttpStatus.OK).body(postService.getPostsById(id));
    }

    @PostMapping
    public ResponseEntity<PostDto> addPost(@RequestBody PostDto postDto)
    {
        return ResponseEntity.status(HttpStatus.OK).body(postService.addPost(postDto));
    }
   
 

   
    
}
