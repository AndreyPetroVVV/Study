package lection3_Strings;

/**
 * Подсчитать количество слов в тексте. Учесть, что слова могут разделяться
 * несколькими пробелами
 */
class Task5 {
    public static void main(String[] args) {
        String s = "  В этом  тексте     много пробелов, а количество    слов нужно определить!  ";
        String sP = " ";
        int sum = calcWordsFromStr(s, sP); // вызов метода для подсчета слов в строке
        System.out.println(s);
        System.out.println("\nКоличество слов = " + sum + "\n");
    }

    private static int calcWordsFromStr(String s, String sP) { //   метод позволяет сравнить массив символов с символом переданнвм из вне и выдает значение TRUE or FALSE
        char symbol;  // хранит значения элементов массвиа символов обрабатываемой строки
        int sum = 0;
        String sn = ""; // создаем переменную для захвата слов
        for (int i = 0; i < s.length(); i++) {
            symbol = s.charAt(i);
            boolean b = compareChars(sP, symbol); //вызов функции, позволяющей сравнивать обрабатываемый символ с массивом символов
            if (b) {
                sn += symbol;//
            } else if (!sn.equals("")) {
                sum++;
                sn = "";
            }
        }
        return sum;
    }

    private static boolean compareChars(String sPattern, char ch) {
        boolean b = true;
        char sString;
        for (int i = 0; i < sPattern.length(); i++) {
            sString = sPattern.charAt(i);
            if (ch == sString) {
                b = false;
                break;
            }
        }
        return b;
    }
}
