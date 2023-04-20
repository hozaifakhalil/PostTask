package com.NewTask.reposatories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NewTask.dto.PostDto;
import com.NewTask.entity.dao.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Long>
{
 public List<Post> findPostByUser_userId(Integer id);
} 