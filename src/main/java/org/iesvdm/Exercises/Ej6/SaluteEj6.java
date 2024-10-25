package org.iesvdm.Exercises.Ej6;

import org.iesvdm.transformer.Transformer;

public class SaluteEj6 implements Transformer<String> {
    private String salute;
    public SaluteEj6(String salute) {
        this.salute = salute;
    }
    @Override
    public String transform(String obj) {
        return salute + " " + obj;
    }
}