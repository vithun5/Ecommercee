package org.example.ecom.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product {
    private int id;
    private String title;
    private String image;
    private String description;
    private double price;

}