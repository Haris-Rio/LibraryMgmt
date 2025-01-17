package com.assess.kafka.producer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assess.kafka.producer.model.Book;
import com.assess.kafka.producer.service.KafkaBookProducerService;

@RestController
@RequestMapping("/books")
public class BookController {
    private final KafkaBookProducerService producerService;

    public BookController(KafkaBookProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public ResponseEntity<?> addBook(@RequestBody Book book) {
       return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody Book book) {
        return null;
    }
}
