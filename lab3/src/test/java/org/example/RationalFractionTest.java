package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RationalFractionTest {

    @Test
    void testReduce() {
        assertEquals("1/2", new RationalFraction(2, 4).toString());
    }

    @Test
    void testNegativeDenominator() {
        assertEquals("-1/2", new RationalFraction(1, -2).toString());
    }

    @Test
    void testZeroDenominator() {
        assertThrows(IllegalArgumentException.class, () -> new RationalFraction(1, 0));
    }

    @Test
    void testMinus() {
        RationalFraction result = new RationalFraction(1, 2).minus(new RationalFraction(1, 3));
        assertEquals("1/6", result.toString());
    }

    @Test
    void testTimes() {
        RationalFraction result = new RationalFraction(2, 3).times(new RationalFraction(3, 4));
        assertEquals("1/2", result.toString());
    }

    @Test
    void testIsZero() {
        assertTrue(new RationalFraction(0, 5).isZero());
        assertFalse(new RationalFraction(1, 5).isZero());
    }
}