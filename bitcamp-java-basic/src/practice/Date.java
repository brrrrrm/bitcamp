
/*
 * divisible 메소드는 int형 배열 array와 int divisor를 매개변수로 받습니다.
array의 각 element 중 divisor로 나누어 떨어지는 값만 포함하는 새로운 배열을 만들어서 반환하도록 divisible에 코드를 작성해 보세요.

예를들어 array가 {5, 9, 7, 10}이고 divisor가 5이면 {5, 10}을 리턴해야 합니다.


 */
package practice;

import java.util.Scanner;


public class Date {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[5];
        int divisor;
        
        System.out.println("배열의 숫자를 입력하시오");
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        array[3] = sc.nextInt();

        System.out.println("나눌 숫자를 입력하시오");
        divisor = sc.nextInt();
        
        for(int i = 0 ; i < array.length ; i++) {
            if (array[i] % divisor == 0) {
            }
        }
}
}