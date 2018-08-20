package com.example.product_service.controller;

import com.example.product_service.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author Yasin Shaw
 * @version v1.0
 */
@RestController
@RequestMapping("products")
public class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("hello")
    public String hello() {
        return "hello, this is product service";
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable Long id) {
        logger.info(String.format("Get order by id: %d", id));
        Product product = new Product();
        product.setId(id);
        product.setName("Apple");
        product.setPrice(BigDecimal.valueOf(2.34));
        return product;
    }
}
