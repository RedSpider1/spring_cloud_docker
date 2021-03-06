package com.cloud_demo.order_service.controller;

import com.cloud_demo.order_service.entity.Order;
import com.cloud_demo.order_service.feign.ProductFeignClient;
import com.cloud_demo.order_service.feign.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yasin Shaw
 * @version v1.0
 */
@RequestMapping("orders")
@RestController
public class OrderController {

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    ProductFeignClient productFeignClient;

    @Autowired
    UserFeignClient userFeignClient;

    @GetMapping("hello")
    public String hello() {
        return "hello, this is order service";
    }

    @GetMapping("{id}")
    public Order getOrderById(@PathVariable Long id) {
        logger.info(String.format("Get order by id: %d", id));
        Order order = new Order();
        order.setOrderId(id);
        order.setUser(userFeignClient.getUserById(id));
        order.setProduct(productFeignClient.getProductById(id));
        return order;
    }
}
