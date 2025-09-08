package org.example;

/**
 * Простая (2 балла)
 * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
 * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
 */
public class Task6 {
    public int fibonacciNumber(int n) {
        int fib1 = 1;
        int fib2 = 1;
        int fib3 = 0;

        for (int i = 3; i <= n; i++) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        return fib3;
    }


}
