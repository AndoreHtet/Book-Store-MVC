package com.example.bookstoremvc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    @Column(columnDefinition = "text")
    private String bioInfo;
    @Column(unique = true)
    private String imageName;
    @OneToMany(mappedBy = "author")
    private List<Book> books=new ArrayList<>();
    public void addBook(Book book){
        book.setAuthor(this);
        books.add(book);
    }

    public Author(String firstName, String lastName, String email, LocalDate dateOfBirth, String bioInfo,
                  String imageName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.bioInfo = bioInfo;
        this.imageName = imageName;
    }
}
