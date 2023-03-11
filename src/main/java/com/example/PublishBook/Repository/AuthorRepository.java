package com.example.PublishBook.Repository;

import com.example.PublishBook.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
