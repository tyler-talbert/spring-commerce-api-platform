package com.codewithtyler.store.dtos;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CartProductDto implements Serializable {
    Long id;
    String name;
    BigDecimal price;
}