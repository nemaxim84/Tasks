package org.example;

/**
 * Простая (2 балла)
 * Мой возраст. Для заданного 0 < n < 200, рассматриваемого как возраст человека,
 * вернуть строку вида: «21 год», «32 года», «12 лет».
 */

public class Task1 {
    public String ageString(int a) {
        if (a % 10 == 0 || a % 10 >= 5 || (a % 100 > 4)&& (a % 100 < 20))
            return a + " лет";
        else if (a % 10 == 1) {
            return a + " год";
        }
        else
            return a + " года";
    }

}
