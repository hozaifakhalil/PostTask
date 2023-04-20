package com.NewTask.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.NewTask.dto.PostDto;
import com.NewTask.entity.dao.Post;
import com.NewTask.mapper.PostMapper;
import com.NewTask.reposatories.PostRepository;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository ;
    
 
    public List<PostDto> getPostsById (Integer id) {

        ResponseEntity<List<PostDto>> posts ;
        List<Post> postlist = postRepository.findPostByUser_userId(id);
        return  (PostMapper.postMapper.mapToPostDto(postlist));
    }
  
    public PostDto addPost(PostDto postDto)
    {
       return PostMapper.postMapper.mapToPostDto(postRepository.save(PostMapper.postMapper.mapToPost(postDto)));
    }
   
}
