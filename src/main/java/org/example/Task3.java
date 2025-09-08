package org.example;

/**
 * Средняя (3 балла)
 * Даны четыре точки на одной прямой: A, B, C и D.
 * Координаты точек a, b, c, d соответственно, b >= a, d >= c.
 * Найти длину пересечения отрезков AB и CD.
 * Если пересечения нет, вернуть -1.
 */

public class Task3 {
    public int findLength(int a, int b, int c, int d) {
        if (a <= c && c <= b && b <= d) {   //точки расположены ACBD
            return b - c;
        } else if (c <= a && a <= b && b <= d) {    //точки расположены CABD
            return b - a;
        } else if (c <= a && a <= d && d <= b) {    //точки расположены CADB
            return b - a;
        } else return -1;   //точки расположены ABCD и CDAB
    }
}
