package bitcamp.java106.pms.controller;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.dao.ClassDao;
import bitcamp.java106.pms.domain.Classroom;

public class ClassController {

    Scanner keyScan;
    ClassDao classDao;
    
    public ClassController(Scanner scanner, ClassDao classDao) {
        this.keyScan = scanner;
        this.classDao = classDao;
    }
    
    public void service(String menu, String option) {
        if (menu.equals("classroom/add"))
            this.onClassroomAdd();
        else if (menu.equals("classroom/list"))
            this.onClassroomList();
        else if (menu.equals("classroom/update"))
            this.onClassroomUpdate(option);
        else if (menu.equals("classroom/delete"))
            this.onClassroomDelete(option);
        else 
            System.out.println("명령어가 올바르지 않습니다.");
    }
    
    void onClassroomAdd() {
        System.out.println("[수업등록]");
        Classroom classroom = new Classroom();
        System.out.print("수업명? ");
        classroom.setTitle(this.keyScan.nextLine());
        System.out.print("시작일? "); 
        classroom.setStartDate(Date.valueOf(this.keyScan.nextLine()));
        System.out.print("종료일? "); 
        classroom.setEndDate(Date.valueOf(this.keyScan.nextLine()));
        System.out.print("교실 번호? ");
        classroom.setClassroomNo(this.keyScan.nextLine());
        classDao.insert(classroom);
    }
    
    void onClassroomList() {
        System.out.println("[수업 목록]");
        Classroom[] classrooms = classDao.list();
        
        for (Classroom classroom : classrooms) {
            System.out.printf("%d, %s, %s ~ %s, %s", classroom.getNo(), 
                    classroom.getTitle(), classroom.getStartDate(), classroom.getEndDate(), 
                    classroom.getClassroomNo());
            System.out.println();
        }
    }
    
    void onClassroomUpdate(String option) {
        System.out.println("[수업 정보 변경]");
        System.out.print("변경할 수업 번호? ");
        option = keyScan.nextLine();
        
        Classroom classroom = classDao.get(Integer.parseInt(option));
        
        if (option == null) {
            System.out.println("유효하지 않은 게시물 번호입니다.");
        } else {
            Classroom updateClassroom = new Classroom();
            System.out.printf("수업명(%s)? ", classroom.getTitle());
            updateClassroom.setTitle(keyScan.nextLine());
            System.out.printf("시작일(%s)? ", classroom.getStartDate());
            updateClassroom.setStartDate(Date.valueOf(keyScan.nextLine()));
            System.out.printf("종료일(%s)? ", classroom.getEndDate());
            updateClassroom.setEndDate(Date.valueOf(keyScan.nextLine()));
            System.out.printf("교실번호(%s)? ", classroom.getClassroomNo());
            updateClassroom.setClassroomNo(keyScan.nextLine());
            updateClassroom.setNo(classroom.getNo());
            
            System.out.println("변경하시겠습니까?(y/N) ");
            if (keyScan.nextLine().toLowerCase().equals("n")) {
                System.out.println("취소하였습니다.");
                return;
            } else {
                classDao.update(updateClassroom);
                System.out.println("변경하였습니다.");
            }
        }
    }
    
    void onClassroomDelete(String option) {
    }
    
}
