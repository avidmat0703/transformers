package org.iesvdm.Exercises.Ej5;

import org.iesvdm.transformer.LispList;
import org.iesvdm.transformer.NumberAdder;
import org.iesvdm.transformer.Transformer;
import java.util.List;
import static org.iesvdm.transformer.Transformers.transformList;

public class Ej5 {
    public static void main(String[] args) {
        LispList<String> l = new LispList<>(new LispList.Cell<>("0", new LispList.Cell<>("1" ,new LispList.Cell<>("2", null))));
        Transformer<String> a = new NumberAdder();
        List<String> lista = transformList(a, l);
        System.out.println(lista);
    }
}