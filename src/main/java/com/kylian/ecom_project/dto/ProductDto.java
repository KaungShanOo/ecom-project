package com.kylian.ecom_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
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
