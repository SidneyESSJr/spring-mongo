package br.com.workshopmongo.worshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.workshopmongo.worshopmongodb.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {
    
}
