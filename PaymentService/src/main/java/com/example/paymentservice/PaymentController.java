package com.example.paymentservice;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
@AllArgsConstructor
public class PaymentController {

    private final CartRestConsumer consumer;

    @GetMapping("/data")
    public String getPaymentData(){
        return "FROM PAYMENT SERVICE: " + consumer.getCartInfo();
    }


}
