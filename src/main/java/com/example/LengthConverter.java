package com.example;

public class LengthConverter {

    private static double convertM(double amount, String mode){
        switch (mode) {
            case "mm":
                amount = amount / (1000);
                break;
            case "cm":
                amount = amount / (100);
                break;
            case "m":
                break;
            case "km":
                amount = amount * (1000);
                break;
            case "in":
                amount = amount / (0.0254);
                break;
            case "ft":
                amount = amount * (0.3048);
                break;
            case "yd":
                amount = amount / (0.9144);
                break;
            case "mi":
                amount = amount * (1609.344);
                break;
            default:
                break;
        }
        return amount;
    }

    private static double MToOthers(double amount, String mode){
        switch (mode) {
            case "mm":
                amount = amount * (1000);
                break;
            case "cm":
                amount = amount * (100);
                break;
            case "me":
                break;
            case "km":
                amount = amount / (1000);
                break;
            case "in":
                amount = amount / (0.0254);
                break;
            case "ft":
                amount = amount / (0.3048);
                break;
            case "yd":
                amount = amount * (0.9144);
                break;
            case "mi":
                amount = amount / (1609.344);
                break;
            default:
                break;
        }
        return amount;
    }

    public static double lengthConvert(double amount, String fromUnit, String toUnit){
        amount = convertM(amount, fromUnit);
        amount = MToOthers(amount, toUnit);
        return amount;
    }
    
}
