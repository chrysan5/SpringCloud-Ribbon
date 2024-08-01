package com.spring_cloud.eureka.client.order;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    //http://localhost:19091/order/1 하면 ProductController의 return값을 가져옴
    @GetMapping("/order/{orderId}")
    public String getOrder(@PathVariable String orderId) {
        return orderService.getOrder(orderId);
    }

}
