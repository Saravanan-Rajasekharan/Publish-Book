package com.example.PublishBook.Repository;

import com.example.PublishBook.Models.Author;
import com.example.PublishBook.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
