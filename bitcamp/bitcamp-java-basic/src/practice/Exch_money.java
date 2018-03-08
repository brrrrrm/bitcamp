package practice;
public class Exch_money{
    public static void main(String []args){
        int dollar=32;
        int euro=58;
        
        double krw1,krw2;
        krw1=(double)dollar*1281.62664;
        krw2=(double)euro*1091.70306;
        
        System.out.printf("남은 돈 : %ld", krw1+krw2);
    }
}