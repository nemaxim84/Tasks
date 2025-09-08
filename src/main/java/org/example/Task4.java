package org.example;

/**
 * Простая (2 балла)
 * <p>
 * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
 * Вернуть число дней в этом месяце этого года по григорианскому календарю.
 */
public class Task4 {

    public int countDays(int month, int year) {
        int countDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                countDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                countDays = 30;
                break;
            case 2:
                if (year % 400 == 0) {
                    countDays = 29;
                } else if (year % 100 == 0) {
                    countDays = 28;
                } else if (year % 4 == 0) {
                    countDays = 29;
                } else countDays = 28;
        }
        return countDays;
    }

}
