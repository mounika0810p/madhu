
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testFirstTenTerms() {
        int[] expected = {
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        };

        assertArrayEquals(expected, App.fibonacci(10));
    }

    @Test
    void testSingleTerm() {
        assertArrayEquals(
            new int[]{0},
            App.fibonacci(1)
        );
    }

    @Test
    void testZeroTerms() {
        assertArrayEquals(
            new int[]{},
            App.fibonacci(0)
        );
    }

    @Test
    void testNegativeTerms() {
        assertThrows(
            IllegalArgumentException.class,
            () -> App.fibonacci(-1)
        );
    }
}
