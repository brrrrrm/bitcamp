package bitcamp.java106.pms;

public class Test_profile {
    public static void main(String[] args){
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);
        
        String name,born_year,color,blood;
        int weight;
        float height, bmi;
            
        System.out.print("Name: "); 
        name = keyScan.nextLine();
        System.out.print("Born_year: "); 
        born_year = keyScan.nextLine();
        System.out.print("Favorite color: "); 
        color = keyScan.nextLine();
        System.out.print("Height: (M)"); 
        height = keyScan.nextFloat();
        keyScan.nextLine();
        System.out.print("Weight: "); 
        weight = keyScan.nextInt();
        keyScan.nextLine();
        System.out.print("Blood type: "); 
        blood = keyScan.nextLine();

        bmi=(float)weight/(height*height);
        

        System.out.print("Hi, I am " + name + ". I was born in " + born_year);
        System.out.print(" and my favorite color is " + color + ". I am " + height +
         "cm tall and " + weight + "kg. So my BMI is " + bmi + " and it means I am normal. ");
    }
}