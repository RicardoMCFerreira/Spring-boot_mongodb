package com.example.workshoopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.workshoopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
