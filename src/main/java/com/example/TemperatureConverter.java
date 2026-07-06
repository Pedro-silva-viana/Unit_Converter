package com.example;

public class TemperatureConverter{
    private static double convertCel(double amount, String mode){
        switch (mode) {
            case "C":
                break;
            case "F":
                amount = (amount - 32) * (5/9);
                break;
            case "K":
                amount = amount - 273.15;
                break;
            default:
                break;
        }
        return amount;
    }
    private static double celToOthers(double amount, String mode){
        switch (mode) {
            case "C":
                break;
            case "F":
                amount = (amount * 1.8) + 32;
                break;
            case "K":
                amount = amount + 273.15;
                break;
            default:
                break;
        }
        return amount;
    }

    public static double temperatureConvert(double amount, String fromUnit, String toUnit){
        amount = convertCel(amount, fromUnit);
        amount = celToOthers(amount, toUnit);
        return amount;
    }
}
