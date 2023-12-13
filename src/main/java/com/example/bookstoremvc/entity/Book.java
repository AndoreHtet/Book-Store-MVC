package com.example.bookstoremvc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private double price;
    private LocalDate yearPublished;
    private String publisher;
    private String bookImageName;
    @Enumerated(EnumType.STRING)
    private BookStatus bookStatus;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Author author;

    public Book(String title, double price, LocalDate yearPublished,
                String publisher,BookStatus bookStatus,String bookImageName) {
        this.title = title;
        this.price = price;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
        this.bookStatus = bookStatus;
        this.bookImageName = bookImageName;
    }
}
