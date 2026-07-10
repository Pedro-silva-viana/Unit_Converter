package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LengthConverterTest {
    @Test
    public void testMillimeterToMeter() {
        double input = 1.0;
        String from = "mm";
        String to = "m";
        double expected = 0.001;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testCentimeterToMeter() {
        double input = 1.0;
        String from = "cm";
        String to = "m";
        double expected = 0.01;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testKilometerToMeter() {
        double input = 1.0;
        String from = "km";
        String to = "m";
        double expected = 1000.0;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testInchToMeter() {
        double input = 1.0;
        String from = "in";
        String to = "m";
        double expected = 0.0254;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testFootToMeter() {
        double input = 1.0;
        String from = "ft";
        String to = "m";
        double expected = 0.3048;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testYardToMeter() {
        double input = 1.0;
        String from = "yd";
        String to = "m";
        double expected = 0.9144;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testMileToMeter() {
        double input = 1.0;
        String from = "mi";
        String to = "m";
        double expected = 1609.344;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testMeterToMillimeter() {
        double input = 1.0;
        String from = "m";
        String to = "mm";
        double expected = 1000.0;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testMeterToCentimeter() {
        double input = 1.0;
        String from = "m";
        String to = "cm";
        double expected = 100.0;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testMeterToKilometer() {
        double input = 1.0;
        String from = "m";
        String to = "km";
        double expected = 0.001;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testMeterToInch() {
        double input = 1.0;
        String from = "m";
        String to = "in";
        double expected = 39.3701;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testMeterToFoot() {
        double input = 1.0;
        String from = "m";
        String to = "ft";
        double expected = 3.28084;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testMeterToYard() {
        double input = 1.0;
        String from = "m";
        String to = "yd";
        double expected = 1.09361;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testMeterToMile() {
        double input = 1.0;
        String from = "m";
        String to = "mi";
        double expected = 0.000621371;

        double result = LengthConverter.lengthConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    
}
