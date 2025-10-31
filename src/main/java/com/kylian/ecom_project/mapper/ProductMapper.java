package com.kylian.ecom_project.mapper;

import com.kylian.ecom_project.dto.ProductDto;
import com.kylian.ecom_project.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    void toEntity(ProductDto dto, @MappingTarget Product product);

    void mapToDto(Product product, @MappingTarget ProductDto dto);
}
