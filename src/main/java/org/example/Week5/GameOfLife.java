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

        int amountOfTrueNeighbors = 0;

        boolean isTopRow = rowIndex == 0;
        boolean isBottomRow = rowIndex == twoDimensionalSquare.length - 1;

        boolean isLeftColumn = index == 0;
        boolean isRightColumn = index == row.length - 1;

        boolean isCorner = (isTopRow || isBottomRow) && (isLeftColumn || isRightColumn);

        if (isCorner) {

            if (isLeftColumn && isTopRow) {
                if (twoDimensionalSquare[rowIndex][index + 1]) {
                    amountOfTrueNeighbors++;
                }
                if (twoDimensionalSquare[rowIndex + 1][index]) {
                    amountOfTrueNeighbors++;
                }
                if (twoDimensionalSquare[rowIndex + 1][index + 1]) {
                    amountOfTrueNeighbors++;
                }
            } if (isRightColumn && isTopRow) {
                if (twoDimensionalSquare[rowIndex][index - 1]) {
                    amountOfTrueNeighbors++;
                }
                if (twoDimensionalSquare[rowIndex + 1][index]) {
                    amountOfTrueNeighbors++;
                }
                if (twoDimensionalSquare[rowIndex + 1][index - 1]) {
                    amountOfTrueNeighbors++;
                }
            }
//            if (isTopRow) {
//                if (twoDimensionalSquare[rowIndex + 1][index] || ) {
//                    amountOfTrueNeighbors++;
//                }
//            } else {
//                if (twoDimensionalSquare[rowIndex][index  - 1]) {
//                    amountOfTrueNeighbors++;
//                }
//            }

            return false;
        }

        boolean isBorder = isTopRow || isBottomRow || isLeftColumn || isRightColumn;

        if (isBorder) {
            return false;
        }

        // midfield

        for (int amountOfRowChecks = rowIndex - 1; amountOfRowChecks < amountOfRowChecks + 4; amountOfRowChecks++) {
            for (int countFor8Neighbors = index - 1; countFor8Neighbors < countFor8Neighbors + 4; countFor8Neighbors++) {

            }
        }

        return false;


//        boolean rulesForCellLife = amountOfTrueNeighbors > 2 && amountOfTrueNeighbors < 3;
    }
}
