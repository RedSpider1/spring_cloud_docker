package com.cloud_demo.user_service.controller;

import com.cloud_demo.user_service.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yasin Shaw
 * @version v1.0
 */
@RestController
@RequestMapping("users")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping
    public String hello() {
        return "hello, this is user service";
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable Long id) {
        logger.info(String.format("Get user by id: %d", id));
        User user = new User();
        user.setId(id);
        user.setAge(22);
        user.setName("Tom");
        return user;
    }
}
