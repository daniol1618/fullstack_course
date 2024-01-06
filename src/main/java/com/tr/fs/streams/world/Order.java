package com.tr.fs.streams.world;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class Order {
    private int id;
    private BigDecimal amount;
    private List<Product> productList;
}
