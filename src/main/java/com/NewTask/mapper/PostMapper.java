package com.NewTask.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.NewTask.dto.PostDto;
import com.NewTask.entity.dao.Post;

@Mapper(componentModel = "spring")
public interface PostMapper {
   


    PostMapper postMapper = Mappers.getMapper(PostMapper.class);

    Post mapToPost(PostDto postDto);
    PostDto mapToPostDto(Post Post);
    List <Post> mapToPost(List<PostDto> PostDto);
    List <PostDto> mapToPostDto(List<Post> posts);


}
