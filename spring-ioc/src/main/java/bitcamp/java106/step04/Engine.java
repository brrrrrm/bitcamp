package bitcamp.java106.step04;

public class Engine {
    String maker;
    int valve;
    int cylinder;
    
    public Engine() {
        System.out.println("Engine()생성자 호출 ");
    }
    @Override
    public String toString() {
        return "Engine [maker=" + maker + ", valve=" + valve + ", cylinder=" + cylinder + "]";
    }
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        System.out.println("engine의 setMaker()호출");
        this.maker = maker;
    }
    public int getValve() {
        return valve;
    }
    public void setValve(int valve) {
        System.out.println("engine의 setValve()호출");

        this.valve = valve;
    }
    public int getCylinder() {
        return cylinder;
    }
    public void setCylinder(int cylinder) {
        System.out.println("engine의 setCylinder()호출");

        this.cylinder = cylinder;
    }
    
}
