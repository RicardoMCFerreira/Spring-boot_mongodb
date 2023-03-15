package com.example.workshoopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.workshoopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
