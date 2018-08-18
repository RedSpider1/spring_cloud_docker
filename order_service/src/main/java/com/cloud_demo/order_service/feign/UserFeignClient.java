package com.cloud_demo.order_service.feign;

import com.cloud_demo.order_service.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Yasin Shaw
 * @version v1.0
 */
@FeignClient("user-service")
public interface UserFeignClient {

    @GetMapping("/users/hello")
    public String getHelloFromUser();

    @GetMapping(value = "/users/{id}")
    Product getProductById(@PathVariable("id") Long id);
}
