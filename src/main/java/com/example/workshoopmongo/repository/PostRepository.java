package com.example.workshoopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.workshoopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	//https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/
	List<Post> findByTitleContainingIgnoreCase(String text);
}
