package org.iesvdm.Exercises.Ej4;

import org.iesvdm.transformer.JoinByAdding;
import org.iesvdm.transformer.Joiner;
import org.iesvdm.transformer.Joiners;
import java.util.ArrayList;
import java.util.Arrays;

public class Ej4 {
    public static <T> ArrayList<T> zipArrayLists(Joiner<T> joiner, ArrayList<T> l1, ArrayList<T> l2) {
        ArrayList<T> result = new ArrayList<>();
        int size = Math.min(l1.size(), l2.size());
        for (int i = 0; i < size; i++) {
            result.add(joiner.join(l1.get(i), l2.get(i)));
        }
        return result;

    }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(6, 8, 9, 7));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(1, 4, 3, 2));
        Joiner<Integer> adder = new JoinByAdding();
        ArrayList<Integer> result = Joiners.zipArrayLists(adder, l1, l2);
        System.out.println("Result: " + result);
    }
}