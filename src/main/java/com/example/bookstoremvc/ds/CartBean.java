package com.example.bookstoremvc.ds;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class CartBean {
    private Set<CartItem> cartItems=new HashSet<>();

    public void addToCart(CartItem cartItem){
        cartItems.add(cartItem);
    }
    public void removeCartItem(int id){
        this.cartItems=cartItems
                .stream()
                .filter(c -> c.getId() != id)
                .collect(Collectors.toSet());
    }

    public Set<CartItem> getCartItems() {
        return cartItems;
    }

    public Integer cartSize(){
        return cartItems.size();
    }
}
