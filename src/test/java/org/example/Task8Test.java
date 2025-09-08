package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task8Test {
    Task8 task8 = new Task8();
    @Test
    void numberOfSquares12() {
        Assertions.assertEquals(6, task8.numberOfSquares(12));
    }

    @Test
    void numberOfSquares7() {
        Assertions.assertEquals(5, task8.numberOfSquares(7));
    }
}