package org.example;

public class Operators {
    public static void main (String[] args) {
        System.out.println("Out" + (5 + 5));
        System.out.println(5 + 5 + "Out");

        int five = 5;
        double fiveWithComma = 5;

        int two = 2;
        double twoWithComma = 2;

        System.out.println(fiveWithComma / two);
        System.out.println(five / twoWithComma);

        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);
        System.out.println(5.0 / 2.0);

        System.out.println((double) 5 / (double) 2);
        System.out.println( 5 + 0.0);


//        Exercise 1

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 && b3 || b2);
        System.out.println(b1 == b3 && b1 == b2);
        System.out.println(b1 || !b2 && !b3 || b2);
        System.out.println(2 < 1 && !b2);
        System.out.println(!b2 || !b1 || !b3);
        System.out.println(!b2^!b1 && b3);
        System.out.println(b1 && b2 || b2 & b3);


//        Exercise 2

//        I can use these variables:
//        1, 3, 6

        byte w = 0;

        for (int i = 0; i <= 128; i++) {
            w++;
        }

        System.out.println(w);

        
    }
}
