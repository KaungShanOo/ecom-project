package com.kylian.ecom_project.controller;

import com.kylian.ecom_project.dto.ProductDto;
import com.kylian.ecom_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductDto> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public ProductDto getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody ProductDto product){
        productService.addOrUpdateProduct(product);
    }


    @PutMapping("/updateProduct")
    public void updateProduct(@RequestBody ProductDto product){
        productService.addOrUpdateProduct(product);
    }


    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
    }
}
