package com.example.PublishBook.Service;

import com.example.PublishBook.Models.Author;
import com.example.PublishBook.Models.Publish;
import com.example.PublishBook.Repository.AuthorRepository;
import com.example.PublishBook.Models.Book;
import com.example.PublishBook.Repository.BookRepository;
import com.example.PublishBook.Repository.PublishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    PublishRepository publishRepository;


    public String addBook(Book book) {
        Book book1 = new Book();


        book1.setAuthor(book.getAuthor());
        book1.setName(book.getName());
        book1.setAuthorName(book.getAuthorName());
        book1.setPages(book.getPages());

        bookRepository.save(book1);

        return "Book added successfully!";

    }

    public String addAuthor(Author author){
        Author author1 = new Author();

        author1.setName(author.getName());
        author1.setAge(author.getAge());
        author1.setGender(author.getGender());
        author1.setRating(author.getRating());

        return "Author added successfully!";
    }


    //		GET API– Find the total number of books written by authors who have rating > X


    public int getNumberOfBooks(double rating){

            int count = 0;

            List<Author> authorList = authorRepository.findAll();
            for(Author author: authorList){
                if(author.getRating()> rating){
                    count += author.getBookList().size();
                }
            }
            return count;
        }

        // Most recent Book by every author

        public List<Book> mostRecentBook(){

        List<Book> bookList = new ArrayList<>();
        List<Author> authorList = authorRepository.findAll();

        for(Author author: authorList){
            List<Publish> publishList = author.getPublishList();
            bookList.add(publishList.get(0).getBook());
        }

        return bookList;
        }



        //Find the total number of books published by author A in year Y.

        public int totalNumberOfBooks(Author author, Integer year) {

            int numberOfBooks = 0;

            // Get the publishList from the given author

            List<Publish> publishList = author.getPublishList();
            // Get the number of books for each publish in the year
            for (Publish publish : publishList) {
                if (publish.getYOP() == year) {
                    numberOfBooks++;
                }
            }

            return numberOfBooks;
        }
}


