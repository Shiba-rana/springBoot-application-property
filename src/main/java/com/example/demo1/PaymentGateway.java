package com.example.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

//    @Value("${paymentgateway.type:Razorpay}")
//    private String type;
//
//    @Value("${paymentgateway.retry-count:3}")
//    private int retryCount;

//    public PaymentGateway(@Value("${paymentgateway.type}") String type,
//                          @Value("${paymentgateway.retry-count}") int retryCount) {
//        this.type = type;
//        this.retryCount = retryCount;
//    }

//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public int getRetryCount() {
//        return retryCount;
//    }
//
//    public void setRetryCount(int retryCount) {
//        this.retryCount = retryCount;
//    }

    private PaymentProperties paymentProperties;

    public PaymentGateway(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }

    public String getType() {
        return this.paymentProperties.getType();
    }

    public int getRetryCount() {
        return this.paymentProperties.getRetryCount();

    }

    public boolean isEnabled() {
        return this.paymentProperties.isEnabled();
    }

    public int getTimeout() {
        return this.paymentProperties.getTimeout();
    }

    public void print() {
        System.out.println(getType());
        System.out.println(getRetryCount());
        System.out.println(isEnabled());
        System.out.println(getTimeout());
    }

}
