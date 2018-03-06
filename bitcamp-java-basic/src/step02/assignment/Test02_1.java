package step02.assignment;

public class Test02_1{
    public static void main(String[] args){
    
    java.io.InputStream key = System.in;
    java.util.Scanner sc = new java.util.Scanner(key);

    String [] name = new String[5];
    int[] kor = new int[5];
    int[] eng = new int[5];
    int[] math = new int [5];
    int[] sum = new int[5];
    float[] average = new float[5];

    for(int i = 0; i < 5 ; i++){
        System.out.print("입력? ");
        name[i] = sc.next();
        kor[i] = sc.nextInt();
        eng[i] = sc.nextInt();
        math[i] = sc.nextInt();
        sum[i] = kor[i] + eng[i] + math[i];
        average[i] = sum[i] / 3; 
    }
    System.out.println("---------------");
    for(int i = 0; i<5;i++){
        System.out.printf("%s %d %d %d %d %f\n", name[i], kor[i], eng[i], math[i], sum[i], average[i]);
        }    
        
  }
}

