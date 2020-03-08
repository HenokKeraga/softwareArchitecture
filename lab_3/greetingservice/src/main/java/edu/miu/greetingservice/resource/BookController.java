package edu.miu.greetingservice.resource;

import edu.miu.greetingservice.model.Book;
import edu.miu.greetingservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

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
