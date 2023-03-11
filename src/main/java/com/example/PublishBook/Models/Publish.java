package com.example.PublishBook.Models;

import com.example.PublishBook.Models.Author;
import com.example.PublishBook.Models.Book;
import jakarta.persistence.*;

@Entity
@Table(name="publish")
public class Publish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int YOP;

    @OneToOne
    private Book book;

    @ManyToOne
    private Author author;




    public Publish() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYOP() {
        return YOP;
    }

    public void setYOP(int YOP) {
        this.YOP = YOP;
    }
}
