package Test;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Car.bild();
        Car.bay();

        String light = "red";
        System.out.println(car.trafficLight(light));
    }
}
