package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Repository 라고 선언을 해 줍니다.
// extends 로 상속을 받습니다. 무엇을 상속받느냐 그건 JpaRepository 를 상속 받습다.
// 두가지 입력 필요
// 왼쪽에는 어떤 entity 를 넣을 것이냐 이다. 우리가 만든 entity Board를 입력
// 오른쪽은 pK 로 지정한 ID 즉, 컬럼의 타입이 어떤지 지정해 줘야 합니다. Board entity 코드를 보면 Integer 로 지정을 했었는데 두번째 매새변수에 그렇게 작성하면 됩니다.
public interface BoardReposity extends JpaRepository<Board, Integer> {
}
