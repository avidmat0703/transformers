package org.iesvdm.Ejercicios.Ej2;

import org.iesvdm.transformer.Transformer;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Transformers {
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a) {
        ArrayList<T> b = new ArrayList<>();
        for(T t : a)
            b.add(tran.transform(t));
        return b;
    }

    //Destructive method: modifies the list as an argument
    public static <T> void applyDest(ArrayList<T> list, UnaryOperator<T> transformer) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, transformer.apply(list.get(i)));
        }
    }
}