package org.example.Week4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ForAndWhileLoopsTasksTest {

    @Test
    void loopFrom1To100() {
        int expected = 5050;
        int current = ForAndWhileLoopsTasks.loopFrom1To100();
        assertEquals(expected, current);
    }

    @Test
    void calculationOfFakultaet() {
        int input = 5;
        int expected = 120;
        int current = ForAndWhileLoopsTasks.calculationOfFakultaet(input);
        assertEquals(expected, current);
    }

    @Test
    void calculationOfFakultaet2() {
        int input = 0;
        int expected = 1;
        int current = ForAndWhileLoopsTasks.calculationOfFakultaet(input);
        assertEquals(expected, current);
    }
}
