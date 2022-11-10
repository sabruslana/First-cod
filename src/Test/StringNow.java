package Test;

import java.util.Locale;

public class StringNow {
    public static void main(String[] args) {
        String person1 = "Иванов Вован";
        String person2 = "иванов иван";
        checkUserName(person1.toLowerCase(),person2.toLowerCase());

    }
    public static void checkUserName(String person1, String person2){
        /*if (person1.equals(person2) == true) {
            System.out.println("Отличное имя!");
        } else{
            System.out.println("Выберите другое имя пользователя");
            String[] array1 = person1.split(" ");
            String[] array2 = person2.split(" ");
            for (int i = 0; i < array1.length; i++) {
                if (array1[i].equals(array2[i]) == false) {
                    System.out.println("Ваше имя имеет длину " + array1[i].length() + " символов");
                    break;
                }
            }
        }*/
        if(person1.toLowerCase().equals(person2.toLowerCase())){
            System.out.println("Отличное имя!");
        } else {
            System.out.println("Выберите другое имя пользователя");
            System.out.println("Ваше имя имеет длину " + person2.length() + " символов");
        }

    }
}
