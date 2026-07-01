package com.example;

public class TemperatureConverter{
    public double convertCel(double amount, String mode){
        switch (mode) {
            case "C":
                break;
            case "F":
                amount = (amount - 32) * (5/9);
                break;
            case "K":
                amount = amount - 273.15;
            default:
                break;
        }
        return amount;
    }
    public double celToOthers(double amont, String mode){
        switch (mode) {
            case "C":
                break;
            case "F":
                amont = (amont * 1.8) + 32;
                break;
            case "K":
                amont = amont + 273.15;
            default:
                break;
        }
        return amont;
    }
}
