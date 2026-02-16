package com.codewithtyler.store.mappers;

import com.codewithtyler.store.dtos.CartDto;
import com.codewithtyler.store.dtos.CartItemDto;
import com.codewithtyler.store.entities.Cart;
import com.codewithtyler.store.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto toDto(Cart cart);

    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
}
