package br.com.workshopmongo.worshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.workshopmongo.worshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
    
}
