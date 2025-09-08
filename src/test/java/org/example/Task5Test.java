package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task5Test {
    Task5 task5 = new Task5();

    @Test
    void countNumbers4() {
        Assertions.assertEquals(4, task5.countNumbers(1010), "УСПЕХ 3 года");
    }

    @Test
    void countNumbersNegativeNumber() {
        Assertions.assertEquals(4, task5.countNumbers(-1000), "УСПЕХ 3 года");
    }

    @Test
    void countNumbers3() {
        Assertions.assertEquals(3, task5.countNumbers(777), "УСПЕХ 3 года");
    }

}