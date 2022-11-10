package Test;

public class Car {
    public static void bild() {
        System.out.println("You must build a new car");
    }

    public static void bay() {
        System.out.println("I will buy this car");

    }

    public String trafficLight(String light) {
        String carSpeed = "drive";
       // String light = "green";

        if (light == "blue"){
            carSpeed = "stand";
        } else if(light == "yellow"){
            carSpeed = "wait";
        } else {
            carSpeed = "drive";
        }
    return carSpeed;
    }

    int carSpeed = 0;


}
