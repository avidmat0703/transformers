package org.iesvdm.Exercises.Ej7;

import java.util.ArrayList;
import java.util.Arrays;

public class MainEj7 {
    public static void main(String[] args) {
        ArrayList<Integer> integerlist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<String> stringlist = new ArrayList<>(Arrays.asList("TheWeekend", "DavidGuetta", "MichaelJackson", "FreddyMercury"));
        CheckUtils.check(new ParCheck(), integerlist);
        CheckUtils.check(new LongCheck(10), stringlist);
        System.out.println(integerlist);
        System.out.println(stringlist);
    }
}