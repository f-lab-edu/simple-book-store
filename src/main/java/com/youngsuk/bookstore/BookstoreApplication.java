package com.youngsuk.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class BookstoreApplication {
  public static void main(String[] args) {
    SpringApplication.run(BookstoreApplication.class, args);
    }
}
