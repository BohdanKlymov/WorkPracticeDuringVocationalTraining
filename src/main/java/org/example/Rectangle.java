package org.example;

public class Rectangle {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        double a;
        double b;

        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
        } catch (NumberFormatException numberFormatException){
            return;
        }

        Diagonal(a, b);
        Scope(a, b);
        Area(a, b);
    }



    static void Diagonal(double a, double b) {
        double d = Math.sqrt((a * a) + (b * b));
        System.out.printf("Diagonale: " + "%.2f", d);
    }

    static void Scope(double a, double b) {
        double u = 2 * (a + b);
        System.out.printf("\nUmfang: " + "%.2f", u);
    }

    static void Area(double a, double b) {
        double aF = a * b;
        System.out.printf("\nFlächeninhalt: " + "%.2f", aF);
    }
}
