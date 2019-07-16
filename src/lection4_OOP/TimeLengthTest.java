package lection4_OOP;

import lection4_OOP.TimeLength;

public class TimeLengthTest {
    public static void main(String[] args) {
        TimeLength TL = new TimeLength("lection4_OOP.TimeLength", 12, 24, 32);
        TimeLength TL2 = new TimeLength("TimeLength2", 74360);
        TimeLength TL3 = new TimeLength("TimeLength3", 205909);
        TimeLength TL4 = new TimeLength("TimeLength4", 5909);
        TimeLength TL5 = new TimeLength("TimeLength5", 89, 24, 32);

        printTimeLength(TL);
        printTimeLength(TL2);
        printTimeLength(TL3);
        printTimeLength(TL4);
        printTimeLength(TL5);
    }

    public static void printTimeLength(TimeLength time) {
        System.out.println("Name [" + time.getName() + "]:");
        System.out.println("time =    " + time);
        System.out.println("seconds = " + time.getShareSeconds());
    }
}
