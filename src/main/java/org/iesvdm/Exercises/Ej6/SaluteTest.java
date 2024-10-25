package org.iesvdm.Exercises.Ej6;

import org.iesvdm.transformer.LispList;
import org.iesvdm.transformer.Transformers;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class SaluteTest {
    @Test
    public void testTransformList() {
        LispList<String> l = new LispList<>(new LispList.Cell<>("Jack", new LispList.Cell<>("Mark", new LispList.Cell<>("Josh", null))));
        MainEj6 salute = new MainEj6("Hi");
        List<String> addlist = Transformers.transformList(salute, l);
        assertEquals(Arrays.asList("Hi Jack", "Hi Mark", "Hi Josh"), addlist);
    }
}