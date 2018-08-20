package com.cloud_demo.order_service.feign;

import com.cloud_demo.order_service.entity.Product;
import com.cloud_demo.order_service.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Yasin Shaw
 * @version v1.0
 */
@FeignClient("user-service")
public interface UserFeignClient {

    @GetMapping("/users/hello")
    String getHelloFromUser();

    @GetMapping(value = "/users/{id}")
    User getUserById(@PathVariable("id") Long id);
}
