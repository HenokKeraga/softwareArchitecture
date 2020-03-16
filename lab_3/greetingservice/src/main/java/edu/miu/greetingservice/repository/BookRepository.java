package edu.miu.greetingservice.repository;

import edu.miu.greetingservice.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository  extends MongoRepository<Book,String> {
}
