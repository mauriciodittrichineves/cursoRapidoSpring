package com.mauraumdev.bookstoremanager.repository;

import com.mauraumdev.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
