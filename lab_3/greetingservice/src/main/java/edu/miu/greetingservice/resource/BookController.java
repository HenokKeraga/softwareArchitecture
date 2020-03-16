package edu.miu.greetingservice.resource;

import edu.miu.greetingservice.model.Book;
import edu.miu.greetingservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Component
@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("/")
    public String start(){
        return "test";
    }


    @GetMapping("/books")
    public ResponseEntity<?> getAllBooks(){
        return  new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }
    @PostMapping(value = "/book")
    public ResponseEntity<?> addBook(@RequestBody Book book)  {
        return  new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/books/{isbn}")
    public  ResponseEntity<?> deleteBook(@PathVariable("isbn") String isbn){

        return new ResponseEntity<>(bookService.deleteBook(isbn),HttpStatus.OK);
    }

}
