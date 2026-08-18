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

        double d = Math.sqrt((a * a) + (b * b));

        double u = 2 * (a + b);

        double aF = a * b;

        System.out.printf("Diagonale: " + "%.2f", d);
        System.out.printf("\nUmfang: " + "%.2f", u);
        System.out.printf("\nFlächeninhalt: " + "%.2f", aF);


    }
}
