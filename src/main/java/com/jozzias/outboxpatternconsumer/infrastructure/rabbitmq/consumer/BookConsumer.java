package com.jozzias.outboxpatternconsumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BookConsumer {

    @RabbitListener(queues = QueueName.BOOKS_QUEUE)
    private void consumeBook(Map<String, Object> bookInfo) {

    }
}
