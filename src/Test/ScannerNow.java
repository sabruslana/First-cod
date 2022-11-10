package Test;

import java.util.Scanner;

public class ScannerNow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
           // isCorrectName = checkName(name);
            if (!isCorrectName){
            } else{
                //System.out.println(formatName(name));
            }
        }

    }
/*
    private static boolean checkName(String name) {
        String trimName = name.trim();
        String[] array1 = trimName.split(" ");
        boolean b = array1.length == 3;
        return b;

    }
/*
    public static boolean checkName(String name) {
        //Написать код здесь
        return false;
    }

    private static String formatName(String name) {
        //Написать код здесь
        return name;
    }

    private static void sortByLength(String[] words) {
        //Написать код здесь
    }*/
}

