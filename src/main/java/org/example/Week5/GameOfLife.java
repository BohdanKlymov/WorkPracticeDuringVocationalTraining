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

//        are needed for function 'rulesForLifeOrDeath'
        int amountOfTrueNeighbors = 0;
        boolean isCellTrue = twoDimensionalSquare[rowIndex][index];


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
            } if (isLeftColumn && isBottomRow) {
                if (twoDimensionalSquare[rowIndex][index + 1]) {
                    amountOfTrueNeighbors++;
                }
                if (twoDimensionalSquare[rowIndex - 1][index]) {
                    amountOfTrueNeighbors++;
                }
                if (twoDimensionalSquare[rowIndex - 1][index + 1]) {
                    amountOfTrueNeighbors++;
                }
            } if (isRightColumn && isBottomRow) {
                if (twoDimensionalSquare[rowIndex][index - 1]) {
                    amountOfTrueNeighbors++;
                }
                if (twoDimensionalSquare[rowIndex - 1][index]) {
                    amountOfTrueNeighbors++;
                }
                if (twoDimensionalSquare[rowIndex - 1][index - 1]) {
                    amountOfTrueNeighbors++;
                }
            }

            return rulesForLifeOrDeath(amountOfTrueNeighbors, isCellTrue);
        }


        boolean isBorder = isTopRow || isBottomRow || isLeftColumn || isRightColumn;

        if (isBorder) {
            if (isTopRow) {
                for (int countOfRowChecks = rowIndex; countOfRowChecks <= countOfRowChecks + 1; countOfRowChecks++) {
                    for (int countOfColumnChecks = index - 1; countOfColumnChecks <= countOfColumnChecks + 2; countOfColumnChecks++) {
                        if (countOfRowChecks == rowIndex && countOfColumnChecks == index) {
                            continue;
                        }

                        if (countOfRowChecks < 0 ||
                                countOfRowChecks >= twoDimensionalSquare.length ||
                                countOfColumnChecks < 0 ||
                                countOfColumnChecks >= twoDimensionalSquare[countOfRowChecks].length) {
                            continue;
                        }


                        if (twoDimensionalSquare[countOfRowChecks][countOfColumnChecks]) {
                            amountOfTrueNeighbors++;
                        }
                    }
                }
            }
            if (isBottomRow) {
                for (int countOfRowChecks = rowIndex - 1; countOfRowChecks <= countOfRowChecks + 1; countOfRowChecks++) {
                    for (int countOfColumnChecks = index - 1; countOfColumnChecks <= countOfColumnChecks + 2; countOfColumnChecks++) {
                        if (countOfRowChecks == rowIndex && countOfColumnChecks == index) {
                            continue;
                        }

                        if (countOfRowChecks < 0 ||
                                countOfRowChecks >= twoDimensionalSquare.length ||
                                countOfColumnChecks < 0 ||
                                countOfColumnChecks >= twoDimensionalSquare[countOfRowChecks].length) {
                            continue;
                        }

                        if (twoDimensionalSquare[countOfRowChecks][countOfColumnChecks]) {
                            amountOfTrueNeighbors++;
                        }
                    }
                }
            }
            if (isLeftColumn) {
                for (int countOfRowChecks = rowIndex - 1; countOfRowChecks <= countOfRowChecks + 2; countOfRowChecks++) {
                    for (int countOfColumnChecks = index; countOfColumnChecks <= countOfColumnChecks + 1; countOfColumnChecks++) {
                        if (countOfRowChecks == rowIndex && countOfColumnChecks == index) {
                            continue;
                        }

                        if (countOfRowChecks < 0 ||
                                countOfRowChecks >= twoDimensionalSquare.length ||
                                countOfColumnChecks < 0 ||
                                countOfColumnChecks >= twoDimensionalSquare[countOfRowChecks].length) {
                            continue;
                        }

                        if (twoDimensionalSquare[countOfRowChecks][countOfColumnChecks]) {
                            amountOfTrueNeighbors++;
                        }
                    }
                }
            }
            if (isRightColumn) {
                for (int countOfRowChecks = rowIndex - 1; countOfRowChecks <= countOfRowChecks + 2; countOfRowChecks++) {
                    for (int countOfColumnChecks = index - 1; countOfColumnChecks <= countOfColumnChecks + 1; countOfColumnChecks++) {
                        if (countOfRowChecks == rowIndex && countOfColumnChecks == index) {
                            continue;
                        }

                        if (countOfRowChecks < 0 ||
                                countOfRowChecks >= twoDimensionalSquare.length ||
                                countOfColumnChecks < 0 ||
                                countOfColumnChecks >= twoDimensionalSquare[countOfRowChecks].length) {
                            continue;
                        }

                        if (twoDimensionalSquare[countOfRowChecks][countOfColumnChecks]) {
                            amountOfTrueNeighbors++;
                        }
                    }
                }
            }
        }


        // midfield

        for (int countOfRowChecks = rowIndex - 1; countOfRowChecks <= rowIndex + 1; countOfRowChecks++) {

            for (int countOfColumnChecks = index - 1; countOfColumnChecks <= index + 1; countOfColumnChecks++) {

                if (countOfRowChecks == rowIndex && countOfColumnChecks == index) {
                    continue;
                }

                if (countOfRowChecks < 0 ||
                        countOfRowChecks >= twoDimensionalSquare.length ||
                        countOfColumnChecks < 0 ||
                        countOfColumnChecks >= twoDimensionalSquare[countOfRowChecks].length) {
                    continue;
                }

                if (twoDimensionalSquare[countOfRowChecks][countOfColumnChecks]) {
                    amountOfTrueNeighbors++;
                }
            }
        }
        return rulesForLifeOrDeath(amountOfTrueNeighbors, isCellTrue);
    }

    public static boolean rulesForLifeOrDeath (int amountOfTrueNeighbors, boolean isCellTrue) {
        if (!isCellTrue) {
            if (amountOfTrueNeighbors == 3) {
                return true;
            }
        }
        return 2 <= amountOfTrueNeighbors && amountOfTrueNeighbors <= 3;
    }
}
