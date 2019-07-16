package lection3_Strings;

import java.util.Formatter;

/**
 * Написать функцию, принимающую на вход целое число, возвращающую
 * строку из 10 символов, дополненных слева нулями.
 * Если число выходит за размер 10 символов вернуть все нули.
 * Пример getString(22) -> 0000000022
 * Найти 3 способа решения задачи и определить наиболее быстрый способ.
 */

public class Task7 {

    public static void main(String[] args) {
        int num = 15354;//2147483647
        final int digits = 10;

        String inputNumber = String.valueOf(num);
        if (inputNumber.length() > digits) {
            System.out.println("00000000000");
        } else {
            long before = System.currentTimeMillis();
            String numberString = String.valueOf(num);

            while (numberString.length() < digits) {
                numberString = "0" + numberString;
            }
            System.out.println(numberString);
            long after = System.currentTimeMillis();
            long diff = after - before;
            System.out.println("The total time is: " + diff + "ms");

            long before2 = System.currentTimeMillis(); // самый медленный
            String with10digits = String.format("%010d", num);
            Formatter fmt = new Formatter();
            fmt.format("%010d", num);
            System.out.println(with10digits);
            long after2 = System.currentTimeMillis();
            long diff2 = after2 - before2;
            System.out.println("The total time is: " + diff2 + "ms");

            long before3 = System.currentTimeMillis(); // самый быстрый
            StringBuilder sb = new StringBuilder();
            String str = Long.toString(num);
            for (int toPrepend = 10 - str.length(); toPrepend > 0; toPrepend--) {
                sb.append('0');
            }
            sb.append(str);
            String result = sb.toString();
            System.out.println(result);
            long after3 = System.currentTimeMillis();
            long diff3 = after3 - before3;
            System.out.println("The total time is: " + diff3 + "ms");
        }
    }
}


