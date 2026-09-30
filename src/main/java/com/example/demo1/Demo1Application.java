package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo1Application.class, args);

		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
//		PaymentProperties paymentProperties = context.getBean(PaymentProperties.class);

//		paymentGateway.setType("PAYMENT");
//		paymentGateway.setRetryCount(5);

//		System.out.println("Payment Gateway Type: " + paymentGateway.getType());
//		System.out.println("Payment Gateway Retry Count: " + paymentGateway.getRetryCount());

		System.out.println("Payment Property: " + paymentGateway.getType());
		System.out.println("Payment Property: " + paymentGateway.getRetryCount());
		System.out.println("Payment Property: " + paymentGateway.getTimeout());
 	}

}
