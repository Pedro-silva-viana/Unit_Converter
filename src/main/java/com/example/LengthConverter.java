package com.example;

public class LengthConverter {

    public double convertM(double amount, String mode){
        switch (mode) {
            case "mm":
                amount = amount / (1000);
                break;
            case "cm":
                amount = amount / (1000);
                break;
            case "m":
                break;
            case "km":
                amount = amount * (1000);
                break;
            case "in":
                amount = amount / (39.35);
                break;
            case "ft":
                amount = amount / (3.281);
                break;
            case "yd":
                amount = amount / (1.094);
                break;
            case "mi":
                amount = amount * (1609);
                break;
            default:
                break;
        }
        return amount;
    }

    public double MToOthers(double amount, String mode){
        switch (mode) {
            case "Mm":
                amount = amount / (1000);
                break;
            case "Cm":
                amount = amount / (1000);
                break;
            case "Me":
                break;
            case "Km":
                amount = amount * (1000);
                break;
            case "In":
                amount = amount / (39.35);
                break;
            case "Ft":
                amount = amount / (3.281);
                break;
            case "Yd":
                amount = amount / (1.094);
                break;
            case "Mi":
                amount = amount * (1609);
                break;
            default:
                break;
        }
        return amount;
    }
    
}
