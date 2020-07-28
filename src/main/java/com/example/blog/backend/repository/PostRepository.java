package com.example.blog.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.backend.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
