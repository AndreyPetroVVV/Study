package lection3_Strings;

import java.util.Scanner;

/**
 * Написать функцию, принимающую в качестве параметров имя, фамилию и
 * отчество и возвращающую инициалы в формате "Ф.И.О".
 * Учесть, что входные параметры могут быть в любом
 * регистре, а результирующая строка должна быть в верхнем.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фамилию");
        char a = sc.nextLine().charAt(0);
        System.out.println("Введите имя");
        char b = sc.nextLine().charAt(0);
        System.out.println("Введите отчество");
        char c = sc.nextLine().charAt(0);
        sc.close();
        String result = initials(a, b, c);
        System.out.println("Инициалы: " + result);
    }

    public static String initials(char a, char b, char c) {
        a = Character.toUpperCase(a);
        b = Character.toUpperCase(b);
        c = Character.toUpperCase(c);
        char d = '.';
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(d);
        sb.append(b);
        sb.append(d);
        sb.append(c);
        sb.append(d);
        return sb.toString();
    }
}
