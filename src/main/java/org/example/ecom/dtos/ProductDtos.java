package org.example.ecom.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ProductDtos {
    private int id;
    private String title;
    private String image;
}
