package Practica;

 class Main {
    public static void main(String[] args) {
        Balance balance = new Balance();
        balance.addLeft(5);
        balance.addRight(10);
        System.out.println(balance.getSituation());
    }
}
public class Balance {
    int L;
    int R;
    public void addRight(int n) {
        L += n;

    }
    public void addLeft(int n) {
        R += n;
    }
    String getSituation() {
        if (L == R) {
            return "==";
        } else if (L > R) {
            return "L";
        } else {
            return "R";
        }
    }
}