package bitcamp.java106.pms.dao;

import java.util.LinkedList;

import bitcamp.java106.pms.domain.Classroom;

public class ClassDao {
    private LinkedList<Classroom> collection = new LinkedList<>();

    
    private int getClassroomIndex(int no) {
        for (int i = 0; i < collection.size() ; i++) {
            Classroom originClassroom = collection.get(i);
            if (originClassroom.getNo() == no)
                return i;
        }
        return -1;
    }
    
    public void insert(Classroom classroom) {
        collection.add(classroom);
    }
    
    public Classroom[] list() {
        Classroom[] arr = new Classroom[collection.size()];
        for (int i = 0; i < collection.size(); i++) 
            arr[i] = collection.get(i);
        return arr;
    }
    
    public Classroom get(int no) {
        int index = this.getClassroomIndex(no);
        if (index < 0) 
            return null;
        return collection.get(index);
    }
    
    public void delete(int no) {
        int index = this.getClassroomIndex(no);
        if (index < 0 )
            return ;
        collection.remove(index);
    }
    
    public void update(Classroom classroom) {
        int index = this.getClassroomIndex(classroom.getNo());
        if (index < 0) 
            return;
        
        collection.set(index, classroom);
    }
}
