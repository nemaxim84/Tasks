package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    Task3 task3 = new Task3();

    @Test
    void findLengthACBD() {
        Assertions.assertEquals(5, task3.findLength(1, 20, 15, 25));
    }
    @Test
    void findLengthCABD() {
        Assertions.assertEquals(5, task3.findLength(10, 15, 1, 20));
    }
    @Test
    void findLengthCADB() {
        Assertions.assertEquals(12, task3.findLength(12, 24, 1, 18));
    }
    @Test
    void findLengthABCD() {
        Assertions.assertEquals(-1, task3.findLength(1, 2, 10, 18));
    }
    @Test
    void findLengthCDAB() {
        Assertions.assertEquals(-1, task3.findLength(10, 12, 3, 4));
    }
}