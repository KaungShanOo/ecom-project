package com.kylian.ecom_project.service;

import com.kylian.ecom_project.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();

    ProductDto getProductById(int id);

    void addOrUpdateProduct(ProductDto product);

    void  deleteProduct(int id);
}
