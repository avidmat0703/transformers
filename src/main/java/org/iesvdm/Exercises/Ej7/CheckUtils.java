package org.iesvdm.Exercises.Ej7;

import java.util.ArrayList;
import java.util.Iterator;

public class CheckUtils {
    public static <T> void check (Checker<T> checker, ArrayList<T> arrayList){
        Iterator<T> it = arrayList.iterator();
        while(it.hasNext()){
            T obj = it.next();
            if(!checker.check(obj)){
                it.remove();
            }
        }
    }
}