package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 task1 = new Task1();

    @Test
    void ageString() {
        Assertions.assertEquals("3 года", task1.ageString(3), "УСПЕХ 3 года");
    }

    @Test
    void ageString2() {
        Assertions.assertEquals("1 год", task1.ageString(1), "УСПЕХ 1 год");
    }
    @Test
    void ageString3() {
        Assertions.assertEquals("117 лет", task1.ageString(117), "УСПЕХ 117 лет");
    }
}