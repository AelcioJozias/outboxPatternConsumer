package com.jozzias.outboxpatternconsumer.service;

import com.jozzias.outboxpatternconsumer.model.Book;
import com.jozzias.outboxpatternconsumer.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void saveFromQueue(final Map<String, Object> bookMap) {
        LocalDateTime bookDate = (LocalDateTime) bookMap.get("year");
        Book book = new Book((UUID) bookMap.get("id"),(String) bookMap.get("description"),
                (String) bookMap.get("title"), bookDate, isPublicDomain(bookDate));
        bookRepository.save(book);
    }

    private boolean isPublicDomain(LocalDateTime localDateTime) {
        return localDateTime.getYear() < 1970;
    }
}
