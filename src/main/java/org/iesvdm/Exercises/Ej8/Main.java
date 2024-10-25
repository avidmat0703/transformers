package org.iesvdm.Exercises.Ej8;

import org.iesvdm.transformer.JoinByAdding;
import org.iesvdm.transformer.Joiner;
import org.iesvdm.transformer.Joiners;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(asList("Hi", "whats", "up", "mate"));
        JoinerS joiner = new JoinerS();
        System.out.println(Joiners.fold(joiner, list));
        ArrayList<Integer> list2 = new ArrayList<>(asList(4, 3, 1, 2));
        Joiner joiner2 = new JoinByAdding();
        System.out.println(Joiners.fold(joiner2, list2));
    }
}