package com.cloud_demo.order_service.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Yasin Shaw
 * @version v1.0
 */
@Data
public class Product {

    private Long id;
    private String name;
    private BigDecimal price;
}
