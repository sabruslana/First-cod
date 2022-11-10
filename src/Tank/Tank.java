package Tank;

public class Tank {

    int x, y;
    int dir;
    int fuel;
    static String nameTank = "Т-34";

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getFuel() {
        return fuel;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public Tank() {
        this(0,0,100);
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.fuel = 100;
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public void goForward(int i) {
       if (i < 0 && -i > fuel){
           i = -fuel;
       } else if(i > fuel){
            i = fuel;
        }
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);
    }


    public void printPosition() {
        System.out.println("The "+ nameTank +" is at " + x +", " + y + ", " + fuel +" now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}
