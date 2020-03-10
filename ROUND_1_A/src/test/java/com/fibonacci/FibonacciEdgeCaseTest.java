package com.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciEdgeCaseTest {
    @Test
    public void whenNumberNotFoundThenIndexIsMinusOne() {
        assertEquals(-1, new FibonacciIndex().findIndexOf(7));
    }

    @Test
    public void cannotFindIndexOfNegativeNumber() {
        assertEquals(-1, new FibonacciIndex().findIndexOf(-1));
    }
}
