package org.example.ecom.controllers;

import org.example.ecom.Model.Product;
import org.example.ecom.dtos.ProductDtos;

import org.example.ecom.services.ProductServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductControllers {

    //Creating constructor for ProductServices

    public ProductServices productService;
    public ProductControllers(ProductServices productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ProductDtos getProductById(@PathVariable("id") Long id ) throws Exception{
//        System.out.println("get method "+product.getName());
        return productService.getProductDtos(id);
    }

    //RequestBody is used to convert json value to java objects
    @ResponseBody
    @PostMapping("")
    public Product createProduct(@RequestBody Product product){

        return product ;
    }
    // Get all Products
    @GetMapping("")
    public List<ProductDtos> getAllProducts(){
        return productService.getAllProducts();
    }


}
