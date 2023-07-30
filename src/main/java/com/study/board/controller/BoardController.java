package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    // GetMapping => 어떤 URL로 접근할건지를 지정하는 어노테이션 입니다.
    @GetMapping("/board/write") //localhost:8090/board/write
    public String boardWriteForm() {
        // return의 "" 안에 들어갈 것 은 어떤 html 파일로 view 파일로 보내줄것인지를 입력해 주는 것 입니다.
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    // Board 라는 entity 형식을 만들어 주었습니다. 즉, 이걸 매게변수로 넣게 되면,
    // 해당 파일에 설정한 entity 형식으로 그대로 받을 수 있습니다.
    // 매개변수에 하나씩 string 으로 해서 받을 수 도 있지만, 데이터가 너무 많아지면 귀찮아 지기 때문에 이렇게 작성.
    public String boardWritePro(Board board) {
        // entity.Board 클래스에 지정한 title에 접근.
        // 접근하기 위해선 Board 자바 클래스에 @Data 어노테이션을 걸어주여야 함.
        // System.out.println("제목 : "+ board.getTitle())

        // BoardService java 클래스 파일에서 write 라는 함수를 만들었습니다.
        // 해당 함수에서는 Board 클래스 값을 그대로 받고, 해당 값을 save 하는 것으로 되어 있습니다.
        boardService.write(board);
        return "";
    }
}
