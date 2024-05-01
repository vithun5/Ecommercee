package org.example.ecom.services;

import lombok.Data;
import org.example.ecom.dtos.ProductDtos;
import org.example.ecom.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProductServices {
    RestTemplate restTemplate = new RestTemplate();
    public ProductDtos  getProductDtos(Long id) throws NotFoundException {
        // getting products based on id
        String Url = "https://fakestoreapi.com/products/" + id;
        ProductDtos productDtos = restTemplate.getForObject(Url, ProductDtos.class);
        if(productDtos == null){
            throw new NotFoundException();
        }
        return convertToDtos(productDtos);

    }

    //converting to dto values
    public ProductDtos convertToDtos(ProductDtos productDtos) {
        ProductDtos obj = new ProductDtos();
        obj.setId(productDtos.getId());
        obj.setTitle(productDtos.getTitle());
        obj.setImage(productDtos.getImage());
        return productDtos;
    }

    // for getting all Products
    public List<ProductDtos> getAllProducts(){

        String Url = "https://fakestoreapi.com/products";
        ProductDtos[] products = restTemplate.getForObject(Url, ProductDtos[].class);
        ArrayList<ProductDtos> returnedProducts = new ArrayList<>();
        for(ProductDtos product : products){
            returnedProducts.add(convertToDtos(product));
        }
        return returnedProducts;
    }
}
