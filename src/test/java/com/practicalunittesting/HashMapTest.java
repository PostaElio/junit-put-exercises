package com.practicalunittesting;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class HashMapTest {

    private HashMap<Integer,String> hashMap;

    @Before
    public void setUp(){
//        Arrage
        hashMap = new HashMap();
    }

    @Test
    @Parameters(method = "getMap")
    public void testRecuperarUnValorRegistrado(Integer key, String value){
//        Act
        hashMap.put(key, value);
        String valorObtenido = hashMap.get(key);

//        Assert
        assertEquals(value,valorObtenido);
    }

    @Test
    public void testRegistrarValorYLimipiarHashMap(){
        hashMap.put(1, "YO");
        hashMap.clear();
        assertTrue(hashMap.isEmpty());
    }


    private static Object[] getMap(){
        return $(
                $(1, "HOLA"),
                $(2, "Elio"),
                $(3, "Posta"),
                $(4, ""),
                $(null, "YO")
        );
    }
}
