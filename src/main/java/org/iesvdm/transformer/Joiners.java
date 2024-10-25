package org.iesvdm.transformer;


import java.util.ArrayList;

public class Joiners {
    public static <T> LispList<T> zipLists(Joiner<T> joiner, LispList<T> ls1, LispList<T> ls2) {
        if (ls1.isEmpty() || ls2.isEmpty())
            return LispList.empty();
        else {
            T h = joiner.join(ls1.head(), ls2.head());
            LispList<T> t = zipLists(joiner, ls1.tail(), ls2.tail());
            return t.cons(h);
        }
    }

    /**
     * Ejercicio N4
     */
    public static <T> ArrayList<T> zipArrayLists(Joiner<T> joiner, ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> result = new ArrayList<>();
        int size = Math.min(list1.size(), list2.size());
        System.out.println("zize :  " + size);
        for (int i = 0; i < size; i++) {
            result.add(joiner.join(list1.get(i), list2.get(i)));
        }
        return result;
    }


    /**
     * Ejercicio N8
     * fold toma una lista de elementos y los combina en un solo elemento
     *
     * @param joiner
     * @param list
     * @param <T>    * @return
     */

    public static <T> T fold(Joiner<T> joiner, ArrayList<T> list) {
        if (!list.isEmpty()) {
            T result = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                result = joiner.join(result, list.get(i));
            }
            return result;
        }
        System.out.println("La lista esta vacia");
        return null;
    }

}