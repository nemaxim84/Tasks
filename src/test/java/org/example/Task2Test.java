package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    Task2 task2 = new Task2();
    @Test
    void triangleProperty1() {
        Assertions.assertEquals(1, task2.triangleProperty(3,4,5));
    }
    @Test
    void triangleProperty2() {
        Assertions.assertEquals(2, task2.triangleProperty(9,6,5));
    }
    @Test
    void triangleProperty0() {
        Assertions.assertEquals(0, task2.triangleProperty(13,14,15));
    }
    @Test
    void trianglePropertyImpossible() {
        Assertions.assertEquals(-1, task2.triangleProperty(20,3,1));
    }

}