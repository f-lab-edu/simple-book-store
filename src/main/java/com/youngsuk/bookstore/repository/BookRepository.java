package com.youngsuk.bookstore.repository;

import java.util.List;

/**
 * 책 데이터를 저장하기 위한 기능이 있는 인터페이스
 *
 * @param <T> 책 도메인과 관련된 Type
 * @param <Id> Id를 가지고 있는 POJO class //TODO. Id 클래스 생성
 */
public interface BookRepository<T, Id> {

    //카테고리 목록 전체 조회에 사용
    List<T> findAll();

    //책 상세 정보 조회에 사용
    Id findById(Id id);
}
