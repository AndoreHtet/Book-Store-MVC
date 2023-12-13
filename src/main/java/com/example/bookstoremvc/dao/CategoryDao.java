package com.example.bookstoremvc.dao;

import com.example.bookstoremvc.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
