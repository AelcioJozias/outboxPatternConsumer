package com.jozzias.outboxpatternconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OutboxPatternConsumerApplication {



    public static void main(String[] args) {
        System.setProperty("spring.amqp.deserialization.trust.all", "true");
        SpringApplication.run(OutboxPatternConsumerApplication.class, args);
    }

}
