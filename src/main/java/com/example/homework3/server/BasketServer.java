package com.example.homework3.server;

import com.example.homework3.basket.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServer {
    private final Basket basket;

    public BasketServer(Basket basket) {
        this.basket = basket;
    }
    public void addAll(List<Integer>values){
        basket.addAll(values);
    }
    public List<Integer> getAll(){
        return basket.getAll();
    }
}
