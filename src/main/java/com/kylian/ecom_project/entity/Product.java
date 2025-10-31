package com.kylian.ecom_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    public int id;
    public String name;
    public String description;
    public double price;
    public String brand;
    public String category;
    public Date releaseDate;
    public Boolean availability;
    public int stockQuantity;
}
