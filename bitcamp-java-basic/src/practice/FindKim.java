package practice;

public class FindKim {
    public String findKim(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
    int x = 0;
    int count = 0;
      for ( x = 0 ; x < seoul.length ; x++) {
          if(seoul[x].equals("Kim")){
              count = x;
          } 
      }
      return String.valueOf(count);
    }
    
    // 실행을 위한 테스트코드입니다.
    public static void main(String[] args) {
        FindKim kim = new FindKim();
        String[] names = {"Queen", "Tod","Kim"};
        System.out.println(kim.findKim(names));
    }
}


