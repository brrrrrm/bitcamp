package practice;

import java.util.Arrays;

class Divisible {
    public int[] divisible(int[] array, int divisor) {
    int[] nums = new int[100];
    int count= 0;
    for (int i = 0 ; i < array.length ; i++){
        if(array[i] % divisor == 0 ) {
            nums[count] = array[i];
            ++count;
        }
    }
    int[] ret = new int[count];
    for (int i = 0 ; i < ret.length ; i++) {
        ret[i] = nums[i];
    }
        return ret;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}