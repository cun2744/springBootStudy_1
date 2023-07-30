package com.study.board.service;

import com.study.board.entity.Board;

import com.study.board.repository.BoardReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Service 라고 선언
public class BoardService {

    @Autowired
    // 자바같은 경우에는 객체를 생성 할 때 new BoardReposity() 라고 해서 생성을 하는데요.
    //  Autowired 어노테이션을 걸면 Spring 의 Spring 이 알아서 읽어와서 boardRepository 여기에 넣어줍니다.
    // 디펜던시 인젝션이라고 한답니다.
    private BoardReposity boardRepository;
    public void write(Board board) {
        // entity에 데이터를 넣어주는 것 입니다.
        boardRepository.save(board);
    }
}
