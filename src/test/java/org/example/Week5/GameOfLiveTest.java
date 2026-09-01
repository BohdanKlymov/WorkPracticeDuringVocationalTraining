package org.example.Week5;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameOfLiveTest {

    @Test
    void blinker() {
        boolean[][] input = new boolean[][] {
                {false, true, false},
                {false, true, false},
                {false, true, false}
        };
        boolean[][] expected = new boolean[][] {
                {false, true, false},
                {false, true, false},
                {false, true, false}
        };
        boolean[][] current = GameOfLife.changingField(input);
        assertTrue(Arrays.deepEquals(expected, current));
    }
}
