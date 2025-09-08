package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task6Test {
    Task6 task6 = new Task6();

    @Test
    void fibonacciNumber6() {
        Assertions.assertEquals(8, task6.fibonacciNumber(6));
    }

    @Test
    void fibonacciNumber8() {
        Assertions.assertEquals(21, task6.fibonacciNumber(8));
    }

    @Test
    void fibonacciNumber33() {
        Assertions.assertEquals(3524578, task6.fibonacciNumber(33));
    }

}