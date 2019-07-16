package lection3_Strings;

/**
 * Написать функцию, принимающую 2 параметра: строку и слово -
 * и возвращающую true, если строка начинается и заканчивается этим словом.
 */

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        System.out.println("Введите слово");
        String str2 = sc.next();
        sc.close();
        boolean c = false;
        boolean d = function(str, str2, c);
        System.out.println(d);
    }

    private static boolean function(String str, String str2, boolean c) {

        boolean isStr2Beginning = str.startsWith(str2);
        boolean isStr2Ending = str.endsWith(str2);
        if (isStr2Beginning && isStr2Ending) {
            c = true;
        }
        return c;
    }
}