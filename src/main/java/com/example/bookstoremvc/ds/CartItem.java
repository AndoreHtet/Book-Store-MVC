package com.example.bookstoremvc.ds;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private int id;
    private String title;
    private double price;
    private String authorName;


}
