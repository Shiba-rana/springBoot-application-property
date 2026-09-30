package com.example.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

    @Value("${paymentgateway.type:Razorpay}")
    private String type;

    @Value("${paymentgateway.retry-count:3}")
    private int retryCount;

//    public PaymentGateway(@Value("${paymentgateway.type}") String type,
//                          @Value("${paymentgateway.retry-count}") int retryCount) {
//        this.type = type;
//        this.retryCount = retryCount;
//    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }


}
