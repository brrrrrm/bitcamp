package bitcamp.java106.pms.dao;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;
=======
import java.util.ArrayList;
import java.util.Iterator;
>>>>>>> 16a2630253d40c6d57244a06acd06b74495b9c9a

import bitcamp.java106.pms.annotation.Component;
import bitcamp.java106.pms.domain.Task;
<<<<<<< HEAD

@Component
public class TaskDao {

    SqlSessionFactory sqlSessionFactory;
    
    public TaskDao(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
            
    public int delete(int no) throws Exception {
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession()) {
            int count = sqlSession.delete(
                    "bitcamp.java106.pms.dao.TaskDao.delete", no);
            sqlSession.commit();
            return count;
        } 
    }
    
    public List<Task> selectList(String teamName) throws Exception {
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession()) {
            return sqlSession.selectList(
                    "bitcamp.java106.pms.dao.TaskDao.selectList", teamName);
        }
    }

    public int insert(Task task) throws Exception {
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession()) {
            int count = sqlSession.insert(
                    "bitcamp.java106.pms.dao.TaskDao.insert", task);
            sqlSession.commit();
            return count;
        }
    }

    public int update(Task task) throws Exception {
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession()) {
            int count = sqlSession.update(
                    "bitcamp.java106.pms.dao.TaskDao.update", task);
            sqlSession.commit();
            return count;
        }
    }

    public Task selectOne(int no) throws Exception {
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession()) {
            return sqlSession.selectOne(
                    "bitcamp.java106.pms.dao.TaskDao.selectOne", no);
        }
    }

    public int updateState(int no, int state) throws Exception {
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession()) {
            HashMap<String,Object> paramMap = new HashMap<>();
            paramMap.put("no", no);
            paramMap.put("state", state);

            int count = sqlSession.update(
                    "bitcamp.java106.pms.dao.TaskDao.updateState", paramMap);
            sqlSession.commit();
            return count;
=======
@Component
public class TaskDao extends AbstractDao<Task> {
    
    // 기존의 list() 메서드로는 작업을 처리할 수 없기 때문에 
    // 팀명으로 작업을 목록을 리턴해주는 메서드를 추가한다. 
    // => 오버로딩
    public Iterator<Task> list(String teamName) {
        ArrayList<Task> tasks = new ArrayList<>();
        for (Task task : collection) {
            if (task.getTeam().getName().equalsIgnoreCase(teamName)) {
                tasks.add(task);
            }
        }
        return tasks.iterator();
    }
    
    public int indexOf(Object key) {
        int taskNo = (Integer) key;
        for (int i = 0; i < collection.size(); i++) {
            Task task = collection.get(i);
            if (task.getNo() == taskNo) {
                return i;
            }
>>>>>>> 16a2630253d40c6d57244a06acd06b74495b9c9a
        }
    }
}

<<<<<<< HEAD
//ver 33 - Mybatis 적용
//ver 32 - DB 커넥션 풀 적용
//ver 31 - JDBC API 적용
//ver 24 - File I/O 적용
//ver 23 - @Component 애노테이션을 붙인다.
=======
>>>>>>> 16a2630253d40c6d57244a06acd06b74495b9c9a
//ver 22 - 추상 클래스 AbstractDao를 상속 받는다.
//ver 19 - 우리 만든 ArrayList 대신 java.util.LinkedList를 사용하여 목록을 다룬다. 
//ver 18 - ArrayList 클래스를 적용하여 객체(의 주소) 목록을 관리한다.
// ver 17 - 클래스 생성





