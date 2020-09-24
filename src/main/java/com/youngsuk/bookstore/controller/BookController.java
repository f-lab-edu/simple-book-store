package com.youngsuk.bookstore.controller;

import com.youngsuk.bookstore.common.utils.constants.SortTypeEnum;
import com.youngsuk.bookstore.dto.BookCategoryDto;
import com.youngsuk.bookstore.dto.BookDto;
import com.youngsuk.bookstore.dto.PagingDto;
import com.youngsuk.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/books/categories/", produces = "application/json; charset=UTF-8")
public class BookController {

  @Autowired
  private BookService bookService;

  /**
   *  @return 모든 책의 코드, 카테고리 리턴
   *    ex) 인문학, 철학 .. (카테고리는 예시용)
   */
  @GetMapping
  public List<BookCategoryDto> getCategoryList() {
    return bookService.cacheBookCategoryList();
  }

  /**
   * @param 사용자가 카테고리 목록에서 클릭한 카테고리의 코드를 받는다
   *             ex) 인문학 001, 철학 002 (코드는 설명용)
   * @return 해당 카테고리의 책 목록을 디폴트 정렬 방법에 맞게 리턴
   */
  @GetMapping
  public List<BookDto> getBookByCategory(String code) {
    return bookService.choiceDefaultBookSortType(code);
  }

  /**
   * @param 사용자가 변경한 카테고리 정렬 코드를 받는다
   *             ex) 판매순 001, 인기순 002 (코드는 설명용)
   * @return 해당 카테고리의 책 목록을 정렬 코드에 따라 다르게 리턴
   */
  @GetMapping
  public List<BookDto> getChangedSortType(String code) {
    return bookService.cacheBookListBySortType(code);
  }

  /**
   * @param 사용자가 선택한 페이지의 숫자를 받는다
   *             ex) 1,2,3,4,5 ...
   * @return 해당 카테고리의 책 목록을 정렬 코드에 따라 다르게 리턴
   */
  @GetMapping
  public List<BookDto> getChangedPageNumber(String page) {
    return bookService.onePageItemCount(page);
  }
}



