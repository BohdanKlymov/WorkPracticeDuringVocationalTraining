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

//    static void Diagonal(double a, double b) {
//        double d = Math.sqrt((a * a) + (b * b));
//        System.out.printf("Diagonale: " + "%.2f", d);
//    }
    static double Diagonal(double a, double b) {
        double d = Math.sqrt((a * a) + (b * b));
        return d;
    }

    static double Scope(double a, double b) {
        double u = 2 * (a + b);
        return u;
    }

    static double Area(double a, double b) {
        double aF = a * b;
        return aF;
    }
}
