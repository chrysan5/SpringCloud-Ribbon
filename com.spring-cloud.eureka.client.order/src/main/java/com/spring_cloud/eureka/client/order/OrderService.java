package com.spring_cloud.eureka.client.order;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ProductClient productClient;

    public String getOrder(String orderId) {
        if(orderId.equals("1") ){
            String productId = "2";
            String productInfo = getProductInfo(productId);
            //String productInfo = productClient.getProduct(productId); //이렇게 하지 않은 이유가 멀까
            return "Your order is " + orderId + " and " + productInfo;

        }
        return "Not exist order...";
    }

    public String getProductInfo(String productId) {
        return productClient.getProduct(productId);
    }
}