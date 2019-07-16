/**
 * Написать два цикла, выполняющих многократное сложение строк,
 * один с помощью оператора сложения и String,
 * второй с помощью StringBuilder и метода append. Сравнить скорость их
 * выполнения.
 */
package lection3_Strings;

public class Task1 {
    public static void main(String[] args) {
        String str = "Первый способ сложения строк быстрее";
        long before = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += " или второй?";
        }
        System.out.println(str);
        long after = System.currentTimeMillis();
        long diff = after - before;
        System.out.println("The total time is: " + diff + "ms");

        StringBuilder sb = new StringBuilder(str);
        long before2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(" или второй?");
        }
        System.out.println(sb);
        long after2 = System.currentTimeMillis();
        long diff2 = after2 - before2;
        System.out.println("The total time is: " + diff2 + "ms");
    }
}