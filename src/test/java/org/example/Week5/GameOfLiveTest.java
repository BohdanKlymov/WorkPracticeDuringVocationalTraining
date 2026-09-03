package org.example.Week5;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameOfLiveTest {

//    Objects without changes / Oscillators

    @Test
    void blinker() {
        boolean[][] input = new boolean[][] {
                {false, true, false},
                {false, true, false},
                {false, true, false}
        };
        boolean[][] expected = new boolean[][] {
                {false, false, false},
                {true, true, true},
                {false, false, false}
        };
        boolean[][] current = GameOfLife.changingField(input);
        assertTrue(Arrays.deepEquals(expected, current));
    }

    @Test
    void blinker2() {
        boolean[][] input = new boolean[][] {
                {false, false, false},
                {true, true, true},
                {false, false, false}
        };
        boolean[][] expected = new boolean[][] {
                {false, true, false},
                {false, true, false},
                {false, true, false}
        };
        boolean[][] current = GameOfLife.changingField(input);
        assertTrue(Arrays.deepEquals(expected, current));
    }

    @Test
    void beacon() {
        boolean[][] input = new boolean[][] {
                {false, false, false, false},
                {false, true, true, true},
                {true, true, true, false},
                {false, false, false, false}
        };
        boolean[][] expected = new boolean[][] {
                {false, false, true, false},
                {true, false, false, true},
                {true, false, false, true},
                {false, true, false, false}
        };
        boolean[][] current = GameOfLife.changingField(input);
        assertTrue(Arrays.deepEquals(expected, current));
    }


//    Stratic objects / Still lifes
    @Test
    void block() {
        boolean[][] input = new boolean[][] {
                {false, false, false, false},
                {false, true, true, false},
                {false, true, true, false},
                {false, false, false, false}
        };
        boolean[][] expected = new boolean[][] {
                {false, false, false, false},
                {false, true, true, false},
                {false, true, true, false},
                {false, false, false, false}
        };
        boolean[][] current = GameOfLife.changingField(input);
        assertTrue(Arrays.deepEquals(expected, current));
    }

    @Test
    void tub() {
        boolean[][] input = new boolean[][] {
                {false, true, false},
                {true, false, true},
                {false, true, false}
        };
        boolean[][] expected = new boolean[][] {
                {false, true, false},
                {true, false, true},
                {false, true, false}
        };
        boolean[][] current = GameOfLife.changingField(input);
        assertTrue(Arrays.deepEquals(expected, current));
    }
}
