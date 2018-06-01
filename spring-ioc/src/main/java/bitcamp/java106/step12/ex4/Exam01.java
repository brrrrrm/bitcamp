// Spring과 MyBatis 연동 : myBatis 가 구현한 DAO 객체 사용하기 
package bitcamp.java106.step12.ex4;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;
import bitcamp.java106.step12.Board;

public class Exam01 {

    public static void main(String[] args) {
        //직접 만들지 말고 제공해주는 클래스를 사용하자
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step12/ex4/application-context.xml");
        BeanUtils.printBeanNames(iocContainer);
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        
         
        //1)게시물 입력
        Board board = new Board();
        board.setTitle("제목입니다.");
        board.setContent("내용입니다.");
        boardDao.insert(board);

        //2)게시물 목록 조회
//        selectList의 파라미터 값을 하나만 넘겨야 하기 때문에 여러 개의 값을 넣고 싶으면 Map에 담아 넘긴다
        HashMap<String,Object> params = new HashMap<>();
        params.put("startIndex", 0);
        params.put("pageSize", 5);
        
        List<Board> list = boardDao.selectList(params);
        for (Board b : list) {
            System.out.printf("%d %s %s\n", 
                    b.getNo(),
                    b.getTitle(),
                    b.getRegisteredDate());
        }
    }
}





