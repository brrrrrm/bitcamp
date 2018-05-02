package step05.assignment;

import java.util.Scanner;

<<<<<<< HEAD
public class test01 {
=======
public class Test01 {
>>>>>>> 16a2630253d40c6d57244a06acd06b74495b9c9a
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int len = keyScan.nextInt();

        int count = 1;
        while (count <= len) {
            int starCnt = 1;
            while (starCnt <= count) {
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            count++;
        }
    }
}