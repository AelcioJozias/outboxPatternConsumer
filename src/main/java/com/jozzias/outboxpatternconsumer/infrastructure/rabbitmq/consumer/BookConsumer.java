package com.jozzias.outboxpatternconsumer.infrastructure.rabbitmq.consumer;

import com.jozzias.outboxpatternconsumer.service.BookService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BookConsumer {

    @Autowired
    private BookService bookService;

    @RabbitListener(queues = QueueName.BOOKS_QUEUE)
    private void consumeBook(Map<String, Object> bookInfo) {
        bookService.saveFromQueue(bookInfo);
    }
}
