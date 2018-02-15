package com.javarush.task.task04.task0416;

/*
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double min = scanner.nextDouble();
        detectColor(min);//напишите тут ваш код
    }

    public static void detectColor(double a) {
        a = (int) a;
        if ((a + 2) % 5 == 0) System.out.println("жёлтый");
        else if ((a + 1) % 5 == 0) System.out.println("красный");
        else System.out.println("зелёный");
    }
}

