package com.example.functional_study.streams.world;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Product {
    private int identification;
    private String name;
    private BigDecimal price;

}
