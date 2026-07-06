package com.example;

public class WeightConverter {

    private static double convertKil(double amount, String mode){
        switch (mode) {
            case "mg":
                amount = amount / (1000000);
                break;
            case "g":
                amount = amount / (1000);
                break;
            case "kg":
                break;
            case "oz":
                amount = amount * (0.028349523125);
                break;
            case "lbs":
                amount = amount * (0.45359237);
                break;
            default:
                break;
        }
        return amount;
    }

    private static double kilToOthers(double amount, String mode){
        switch (mode) {
            case "mg":
                amount = amount * (1000000);
                break;
            case "g":
                amount = amount * (1000);
                break;
            case "kg":
                break;
            case "oz":
                amount = amount / (0.028349523125);
                break;
            case "lbs":
                amount = amount / (0.45359237);
                break;
            default:
                break;
        }
        return amount;
    }

    public static double weightConvert(double amount, String fromUnit, String toUnit){
        amount = convertKil(amount, fromUnit);
        amount = kilToOthers(amount, toUnit);
        return amount;
    }
}
