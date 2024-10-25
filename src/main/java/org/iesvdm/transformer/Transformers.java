package org.iesvdm.transformer;

import java.util.ArrayList;
import java.util.List;


public class Transformers {

    /**
     * Ejercicio N1
     * Modify the class Transformers so that it contains a static method applyConst
     * which takes a Transformer object and an ArrayList object as arguments and returns a new
     */
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a) {
        ArrayList<T> b = new ArrayList<>();
        for (T t : a)
            b.add(tran.transform(t));
        return b;
    }


    /**
     * Ejercicio N2
     *
     * El método estático applyConst en la clase Transformers funciona de manera constructiva. Agrega un método estático
     * applyDest a la clase Transformers que funcione de manera similar a applyConst pero de manera destructiva en lugar de constructiva
     * (es decir, que cambie su argumento ArrayList en lugar de construir y devolver uno nuevo).
     */

    /**
     * Modificamos el ArrayList a en su lugar, aplicando la transformación a cada elemento.
     */

    public static <T> void applyDest(Transformer<T> tran, ArrayList<T> a) {
        for (int i = 0; i < a.size(); i++)
            a.set(i, tran.transform(a.get(i)));
    }

    /***
     * Ejercicio N3 ---> La explicación de este ejercicio se encuentra en la clase Ejercicio3.java
     */

    /**
     * Ejercicio N4 ---> Esta hecho en la clase Joiners.java y en la clase Ejercicio4.java
     */


    /**
     * Ejercicio N5
     * Escribe un método estático transformList para la clase Transformers
     * que tome un objeto Transformer y un LispList y devuelva el resultado de aplicar
     * el método transform del objeto Transformer a cada uno de los elementos en el LispList.
     * Escribe algo de código para demostrar su funcionamiento.
     */

    /**
     * Este método toma un objeto Transformer y un LispList y devuelve una lista de los elementos de la lista
     * original transformados por el método transform del objeto Transformer.
     * en este caso se usa un while para recorrer la lista y se va añadiendo a la lista de salida el resultado de
     * aplicar el método transform del objeto Transformer a cada uno de los elementos en el LispList
     * al final se retorna la lista de salida
     *
     * */
    public static <T> List<T> transformList(Transformer<T> tran, LispList<T> l) {
        if (l.isEmpty()) {
            System.out.println("La lista esta vacia");
            return null;
        } else {
            List<T> lista = new ArrayList<>();
            while (!l.isEmpty()) {
                lista.add(tran.transform(l.head()));
                l = l.tail();
            }
            return lista;
        }
    }


}

