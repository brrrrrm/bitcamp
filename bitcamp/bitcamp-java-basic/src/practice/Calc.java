package practice;
public class Calc{
    public static void main(String []args){
        int pay,basePay,workingHours;
        basePay=8000;
        workingHours=160;
        pay=basePay*workingHours;
        System.out.printf("총급여 : %d", pay);
    }
}