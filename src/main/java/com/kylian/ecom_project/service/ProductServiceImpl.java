package com.kylian.ecom_project.service;

import com.kylian.ecom_project.dto.ProductDto;
import com.kylian.ecom_project.entity.Product;
import com.kylian.ecom_project.mapper.ProductMapper;
import com.kylian.ecom_project.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepo productRepo;
    private final ProductMapper productMapper;

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> productList = productRepo.findAll();
        List<ProductDto> productDtoList = new ArrayList<>();
        for (Product product : productList) {
            ProductDto productDto = new ProductDto();
            productMapper.mapToDto(product, productDto);
            productDtoList.add(productDto);
        }
        return productDtoList;
    }

    @Override
    public ProductDto getProductById(int id) {
        Product product = productRepo.findById(id).orElse(null);
        if (product == null) {
            return null;
        }
        ProductDto productDto = new ProductDto();
        productMapper.mapToDto(product, productDto);
        return productDto;
    }

    @Override
    public void addOrUpdateProduct(ProductDto productdto) {
        Product product = new Product();
        productMapper.toEntity(productdto, product);
        productRepo.save(product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }
}
