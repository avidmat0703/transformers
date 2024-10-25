package org.iesvdm.Exercises.Ej7;

public class LongCheck  implements Checker<String> {
    private int length;

    public LongCheck(int length){
        this.length = length;
    }

    @Override
    public boolean check(String obj) {
        return  obj.length() > length;
    }
}