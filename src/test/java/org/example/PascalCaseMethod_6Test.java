package org.example;
import org.example.PascalCaseMethod_6.Result;
import org.junit.jupiter.api.Test;

import static org.example.PascalCaseMethod_6.Main.outputOfResult;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalCaseMethod_6Test {
    @Test
    void FindingTheBiggestSum() {
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int outputInt = 6;
        int[] output = {4, -1, 2, 1};
        Result expected = new Result(outputInt, output);;
        Result current = outputOfResult(input);
        assertEquals(expected, current);
    }
}
