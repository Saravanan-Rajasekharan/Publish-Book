package com.example.PublishBook.Repository;

import com.example.PublishBook.Models.Publish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishRepository extends JpaRepository<Publish,Integer> {
}
