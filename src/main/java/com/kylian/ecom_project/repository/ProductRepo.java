package com.kylian.ecom_project.repository;

import com.kylian.ecom_project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
