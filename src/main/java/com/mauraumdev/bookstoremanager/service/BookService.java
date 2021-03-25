package com.mauraumdev.bookstoremanager.service;

import com.mauraumdev.bookstoremanager.dto.MessageResponseDTO;
import com.mauraumdev.bookstoremanager.entity.Book;
import com.mauraumdev.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public MessageResponseDTO create (Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with id: " + savedBook.getId())
                .build();
    }

}
