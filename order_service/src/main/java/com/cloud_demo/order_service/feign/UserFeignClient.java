package com.cloud_demo.order_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yasin Shaw
 * @version v1.0
 */
@FeignClient("user-service")
public interface UserFeignClient {

    @GetMapping("/users/hello")
    public String getHelloFromUser();
}
