package org.example.Week5;

import java.util.Arrays;

public class GameOfLife {
    public static void main(String[] args) {
        boolean[][] blinker = new boolean[][] {
                {false, true, false},
                {false, true, false},
                {false, true, false}
        };

        for (boolean[] row : blinker) {
            System.out.println(Arrays.toString(row));
        }



        System.out.println(Arrays.toString(changingField(blinker)));

    }

    public static boolean[][] changingField(boolean[][] twoDimensionalSquare) {

//        Copy 2D array
        boolean[][] nextGeneration = new boolean[twoDimensionalSquare.length][];

        for (int i = 0; i < twoDimensionalSquare.length; i++) {
            nextGeneration[i] = twoDimensionalSquare[i].clone();
        }
//

        for (int rowIndex = 0; rowIndex < twoDimensionalSquare.length; rowIndex++) {

            boolean[] row = twoDimensionalSquare[rowIndex];

            for (int index = 0; index < row.length; index++) {

                nextGeneration[rowIndex][index] = trueOrFalse(index, rowIndex, row, twoDimensionalSquare);
            }
        }

        return nextGeneration;
    }

    public static boolean trueOrFalse(int index, int rowIndex, boolean[] row, boolean[][] twoDimensionalSquare) {

//                here corners will be checked
        if (rowIndex == 0 && index == 0 || rowIndex == 0 && index == row.length - 1 ||
                rowIndex == twoDimensionalSquare.length - 1 && index == row.length - 1) {

                return false;
        }
        else {
//                         here borders will be checked
            if (rowIndex == 0 && index != 0 && index != row.length - 1 ||
                    rowIndex == twoDimensionalSquare.length - 1 && index != 0 && index != row.length - 1 ||
                    index == 0 && rowIndex != 0 && rowIndex != twoDimensionalSquare.length ||
                    index == row.length - 1 && rowIndex != 0 && rowIndex != twoDimensionalSquare.length - 1) {

                    return false;
            }
//                        here midfield will be checked
            else {
                return false;
            }
        }
    }
}
