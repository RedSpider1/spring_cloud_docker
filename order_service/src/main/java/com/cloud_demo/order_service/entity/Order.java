package com.cloud_demo.order_service.entity;

import lombok.Data;

/**
 * @author Yasin Shaw
 * @version v1.0
 */
@Data
public class Order {

    private Long orderId;
    private User user;
    private Product product;
}
