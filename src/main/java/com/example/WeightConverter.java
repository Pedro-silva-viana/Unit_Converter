package com.example;

public class WeightConverter {

    public double convertKil(double amount, String mode){
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
                amount = amount / (35.274);
                break;
            case "lbs":
                amount = amount / (2.205);
                break;
            default:
                break;
        }
        return amount;
    }

    public double KilToOthers(double amount, String mode){
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
                amount = amount * (35.274);
                break;
            case "lbs":
                amount = amount * (2.205);
                break;
            default:
                break;
        }
        return amount;
    }

}
