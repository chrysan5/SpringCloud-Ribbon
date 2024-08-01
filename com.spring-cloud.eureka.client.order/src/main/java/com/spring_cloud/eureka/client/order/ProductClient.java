package com.spring_cloud.eureka.client.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//product app을 호출하는 코드이다.
@FeignClient(name = "product-service")
public interface ProductClient {
    @GetMapping("/product/{id}")
    String getProduct(@PathVariable("id") String id);
}

