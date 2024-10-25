package org.iesvdm.Exercises.Ej7;

public class ParCheck implements Checker<Integer> {
    @Override
    public boolean check(Integer obj) {
        return obj % 2 == 0;
    }
}