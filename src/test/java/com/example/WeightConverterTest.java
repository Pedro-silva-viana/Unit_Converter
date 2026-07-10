package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WeightConverterTest {
    @Test
    public void testMilligramToKilogram() {
        double input = 1.0;
        String from = "mg";
        String to = "kg";
        double expected = 0.000001;

        double result = WeightConverter.weightConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testGramToKilogram() {
        double input = 1.0;
        String from = "g";
        String to = "kg";
        double expected = 0.001;

        double result = WeightConverter.weightConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testOunceToKilogram() {
        double input = 1.0;
        String from = "oz";
        String to = "kg";
        double expected = 0.028349523125;

        double result = WeightConverter.weightConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testPoundToKilogram() {
        double input = 1.0;
        String from = "lbs";
        String to = "kg";
        double expected = 0.45359237;

        double result = WeightConverter.weightConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testKilogramToMilligram() {
        double input = 1.0;
        String from = "kg";
        String to = "mg";
        double expected = 1000000;

        double result = WeightConverter.weightConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testKilogramToGram() {
        double input = 1.0;
        String from = "kg";
        String to = "g";
        double expected = 1000;

        double result = WeightConverter.weightConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testKilogramToOunce() {
        double input = 1.0;
        String from = "kg";
        String to = "oz";
        double expected = 35.274;

        double result = WeightConverter.weightConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testKilogramToPound() {
        double input = 1.0;
        String from = "kg";
        String to = "lbs";
        double expected = 2.20462;

        double result = WeightConverter.weightConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
}
