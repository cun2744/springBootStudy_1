package com.study.board.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

// Entity 라고 하면 JPA 가 이것을 읽어 들입니다. Board 테이블에 관한 설정이구나~라는 것 으로 파악하고 읽어서
@Entity
@Data // 다른 곳에서 해당 클래스에 접근 즉, 데이터를 가져올 수 있게 하기 위해서, 필요.
public class Board {
    // table 형식에 맞게 작성함.
    @Id // 프라이머리 키 라는 것을 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Mysql MariaDB 에서 사용하는 것 입니다.
    private Integer id;
    private String title;
    private String content;
}
