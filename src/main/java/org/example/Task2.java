package org.example;

/**
 * Простая (2 балла)
 * Треугольник задан длинами своих сторон a, b, c.
 * Проверить, является ли данный треугольник остроугольным (вернуть 0),
 * прямоугольным (вернуть 1) или тупоугольным (вернуть 2).
 * Если такой треугольник не существует, вернуть -1.
 */

public class Task2 {

    public int triangleProperty(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int k = a + b + c - min - max;
        if (max >= min + k)
            return -1;
        if (max * max < (min * min + k * k)) {
            return 0;
        } else if (max * max > (min * min + k * k)) {
            return 2;
        } else if (max * max == (min * min + k * k)) {
            return 1;
        } else return -1;
    }


}
