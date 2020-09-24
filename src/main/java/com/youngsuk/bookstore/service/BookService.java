package com.youngsuk.bookstore.service;

import com.youngsuk.bookstore.dto.BookCategoryDto;
import com.youngsuk.bookstore.dto.BookDto;

import java.util.List;

public interface BookService {
  public List<BookCategoryDto> cacheBookCategoryList();
  public List<BookDto> getBookByCategory(BookDto bookDto);
}
