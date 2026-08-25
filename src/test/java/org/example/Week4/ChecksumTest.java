package org.example.Week4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

public class ChecksumTest {

    @ParameterizedTest
    @CsvSource({"143, 8", "0, 0", "23, 5"})
    void checksumTest(int input, int expected) {
        int current = Checksum.calculateChecksum(input);
        assertEquals(expected, current);
    }
}
