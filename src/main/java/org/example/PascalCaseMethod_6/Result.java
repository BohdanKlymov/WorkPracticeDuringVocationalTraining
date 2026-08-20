package org.example.PascalCaseMethod_6;

import java.util.Arrays;

public class Result {
    int maxSum;
    int[] arrayOutput;

    public Result(int maxSum, int[] arrayOutput) {
        this.maxSum = maxSum;
        this.arrayOutput = arrayOutput;
    }

    @Override
    public String toString() {
        return maxSum + "\nSum of: " + Arrays.toString(arrayOutput);
    }
}
