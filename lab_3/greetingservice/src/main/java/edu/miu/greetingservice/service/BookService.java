
package edu.miu.greetingservice.service;

import edu.miu.greetingservice.dao.BookDao;
import edu.miu.greetingservice.model.Book;
import edu.miu.greetingservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    Book book= new Book();
    public Book  addBook(Book book){
        List<Book> books=bookRepository.findAll();
        bookRepository.save(book);
        return book;
    }
    public List<Book> deleteBook(String isbn){
        Book book=bookRepository.findById(isbn).get();
        bookRepository.delete(book);
        return bookRepository.findAll();
    }
    public Book getBook(String isbn){

        return bookRepository.findById(isbn).get();
    }
    public List<Book> getAllBooks(){

        return bookRepository.findAll();
    }
}
