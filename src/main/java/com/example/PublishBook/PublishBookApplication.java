package com.example.PublishBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublishBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublishBookApplication.class, args);
	}

}

//	Create an API for Book-Author management system ,where you are given
//		Book ,author ,publish

//		Book = name ,author_name,pages
//		Author = name,age ,gender ,rating
//		Publish= Book ,Author ,Year of publishing
//
//
//		POST API add Book (name ,author name,no of pages, year of publishing)
//		POST API - Add author (author name , age ,gender,rating)
//		GET API– Find the total number of books written by authors who have rating > X
//		GET API -Find the list of the most recent book written by every author .
//		Find the total number of books published by author A in year Y.
