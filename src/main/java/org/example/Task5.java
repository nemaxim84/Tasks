package org.example;

/**
 * Простая (2 балла)
 * Найти количество цифр в заданном числе n.
 * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 * Использовать операции со строками в этой задаче запрещается.
 */

public class Task5 {
    public int countNumbers(int n) {
        int a = 0;
        int b = 1;
        while (b <= Math.abs(n)) {
            a++;
            b *= 10;
        }
        return a;
    }

}
