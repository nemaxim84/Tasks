package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    Task4 task4 = new Task4();

    @Test
    void countDays21900() {
        Assertions.assertEquals(28, task4.countDays(2, 1900));
    }

    @Test
    void countDays32020() {
        Assertions.assertEquals(31, task4.countDays(3, 2020));
    }

    @Test
    void countDays22000() {
        Assertions.assertEquals(29, task4.countDays(2, 2000));
    }

    @Test
    void countDays52025() {
        Assertions.assertEquals(31, task4.countDays(5, 2025));
    }
}