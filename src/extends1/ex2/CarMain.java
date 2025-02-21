package extends1.ex2;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.move(); //상속효과로 부모메소드 사용
        e.charge(); //자식메소드

        GasCar g = new GasCar();
        g.move(); //상속효과로 부모메소드 사용
        g.fillUp(); //자식메소드
    }
}
