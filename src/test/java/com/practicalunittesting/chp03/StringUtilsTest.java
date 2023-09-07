package com.practicalunittesting.chp03;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class StringUtilsTest {

    @Test
    @Parameters(method = "getStrings")
    public void testReverseOk(String string) {
        String textoInvertido = StringUtils.reverse(string);
//        assertEquals("ALOH",textoInvertido);
        String[] wea = {"ALOH","oilE","atsoP",""};
        assertTrue(Arrays.asList(wea).contains(textoInvertido));
    }

    @Test(expected = NullPointerException.class)
    public void testReverseException() {
        String textoInvertido = StringUtils.reverse(null);
    }

    private static Object[] getStrings(){
        return $(
                $("HOLA"),
                $("Elio"),
                $("Posta"),
                $("")
        );
    }
}