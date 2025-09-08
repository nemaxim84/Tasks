package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task7Test {
    Task7 task7 = new Task7();
    @Test
    void revers2345554() {
        Assertions.assertEquals(4555432, task7.revers(2345554));
    }
    @Test
    void revers7654678() {
        Assertions.assertEquals(8764567, task7.revers(7654678));
    }

}