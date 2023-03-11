package com.example.PublishBook.Controller;

import com.example.PublishBook.Models.Author;
import com.example.PublishBook.Models.Book;
import com.example.PublishBook.Models.Publish;
import com.example.PublishBook.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PostMapping("/addAuthor")
    public String addAuthor(@RequestBody Author author){
        return bookService.addAuthor(author);
    }
    @GetMapping("/getNumberOfBooks")
    public int getNumberOfBooks(@RequestParam double rating){
        return bookService.getNumberOfBooks(rating);
    }

    @GetMapping("/mostRecentBook")
    public List<Book> mostRecentBook(){
        return bookService.mostRecentBook();
    }

    @GetMapping("/totalNumberOfBooks/{year}")
    public int totalNumberOfBooks(@RequestBody Author author,@PathVariable("year") Integer year){
    return bookService.totalNumberOfBooks(author,year);
    }
}
