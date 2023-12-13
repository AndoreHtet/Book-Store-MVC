package com.example.bookstoremvc.dao;

import com.example.bookstoremvc.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Author,Integer> {
}
