package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Сложная (4 балла)
 * Найти n-ю цифру последовательности из квадратов целых чисел:
 * 149162536496481100121144...
 * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
 * Использовать операции со строками в этой задаче запрещается.
 */
public class Task8 {
    public int numberOfSquares(int n) {
        int currentNumber = 1;    // текущее число для возведения в квадрат
        int totalDigits = 0;      // общее количество цифр в последовательности

        while (true) {
            // Вычисляем квадрат текущего числа
            int square = currentNumber * currentNumber;

            // Определяем количество цифр в текущем квадрате
            int digitsInSquare = 0;
            int temp = square;
            while (temp > 0) {
                digitsInSquare++;
                temp /= 10;
            }

            // Проверяем, не достигли ли мы нужной позиции
            if (totalDigits + digitsInSquare >= n) {
                // Находим позицию внутри текущего квадрата
                int positionInSquare = n - totalDigits - 1;

                // Извлекаем нужную цифру
                for (int i = 0; i < digitsInSquare - positionInSquare - 1; i++) {
                    square /= 10;
                }
                return square % 10;
            }

            // Обновляем счетчик цифр
            totalDigits += digitsInSquare;
            currentNumber++;
        }
    }

}
