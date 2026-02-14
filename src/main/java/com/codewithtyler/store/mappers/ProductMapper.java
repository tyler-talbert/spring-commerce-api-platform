package com.codewithtyler.store.mappers;

import com.codewithtyler.store.dtos.ProductDto;
import com.codewithtyler.store.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "categoryId", source = "category.id")
    ProductDto toDto(Product product);
}
