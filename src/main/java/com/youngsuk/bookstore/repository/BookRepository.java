package com.youngsuk.bookstore.repository;

import com.youngsuk.bookstore.dto.BookDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;


@Mapper
@Repository
public interface BookRepository {
  List<BookDto> selectBookByCategory(BookDto bookDto);
  List<BookDto> findBookCategoryList();
}
