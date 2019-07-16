package lection3_Strings;

/**
 * Написать функцию, заменяющую несколько последовательных
 * одинаковых символов в строке одним.
 * Пример: aaabbcdeef -> abcdef
 */

public class Task6 {
    static char ch;

    public static void main(String[] args) {
        String str = "RrrraaG...Pbbbbcccd"; //bug na i = 0
        char[] charArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0 && charArray[i] != charArray[i + 1]) {
                System.out.print(charArray[i]);
                count = 0;
                ch = charArray[i];
                continue;
            }
            if (i != 0) {
                if (charArray[i] == ch)
                    continue;//ddddee
                if (charArray[i] == charArray[i - 1]) {
                    count++;
                } else {
                    System.out.print(charArray[i]);
                    count = 0;
                    ch = charArray[i];
                }
                if (count == 1) {
                    System.out.print(charArray[i]);
                    count = 0;
                    ch = charArray[i];
                } else {
                    count = 0;
                }
            }
        }
    }
}

