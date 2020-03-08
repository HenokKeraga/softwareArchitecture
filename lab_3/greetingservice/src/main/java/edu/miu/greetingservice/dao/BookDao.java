package edu.miu.greetingservice.dao;

import edu.miu.greetingservice.model.Book;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
public class BookDao {
    List<Book> books;
     {
        books= new ArrayList<Book>(){{
            add(new Book("123","Book1",20.95,"James Brown"));
            add(new Book("124","Book 2",20.95,"Mary Jones"));
        }};
    }

}
