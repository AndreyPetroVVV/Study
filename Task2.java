package lection3_Strings;

/**
 * Заменить все грустные смайлы :( в строке на весёлые :)
 */

public class Task2 {
    public static void main(String[] args) {
        String str = ":(Заме:(нить :( все :( грустные :( смайлы :( в строке на весёлые :)";
        str = str.replace('(', ')');
        System.out.println(str);
    }
}
