package com.example.paymentservice;

import lombok.AllArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@AllArgsConstructor
public class CartRestConsumer {

    private final DiscoveryClient discoveryClient;

    public String getCartInfo(){
        List<ServiceInstance> serviceList = discoveryClient.getInstances("CART-SERVICE");
        ServiceInstance serviceInstance = serviceList.get(0);
        String url = serviceInstance.getUri()+"/cart/getData";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }

}
