package com.jozzias.outboxpatternconsumer.repository;

import com.jozzias.outboxpatternconsumer.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
}
