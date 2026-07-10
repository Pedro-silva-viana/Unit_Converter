package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TemperatureConverterTest {
    @Test
    public void testCelsiusToFahrenheit() {
        double input = 0.0;
        String from = "C";
        String to = "F";
        double expected = 32.0;

        double result = TemperatureConverter.temperatureConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testCelsiusToKelvin() {
        double input = 0.0;
        String from = "C";
        String to = "K";
        double expected = 273.15;

        double result = TemperatureConverter.temperatureConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testFahrenheitToCelsius() {
        double input = 0.0;
        String from = "F";
        String to = "C";
        double expected = -17.777777;

        double result = TemperatureConverter.temperatureConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void testKelvinToCelsius() {
        double input = 0.0;
        String from = "K";
        String to = "C";
        double expected = -273.15;

        double result = TemperatureConverter.temperatureConvert(input, from, to);

        assertEquals(expected, result, 0.0001);
    }
    
}
