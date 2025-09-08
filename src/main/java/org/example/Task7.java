package org.example;

/**
 * Средняя (3 балла)
 * Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431.
 * Использовать операции со строками в этой задаче запрещается.
 */
public class Task7 {
    public int revers(int n) {
        int m = 0;
        while (n > 0) {
            m = m * 10;
            m = m + n % 10;
            n = n / 10;
        }
        return m;
    }
}
