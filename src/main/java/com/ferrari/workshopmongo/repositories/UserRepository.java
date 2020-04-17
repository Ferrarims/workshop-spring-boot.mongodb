package com.ferrari.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ferrari.workshopmongo.domains.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
