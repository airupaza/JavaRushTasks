package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int z = Integer.parseInt(reader.readLine());
        int a = z/4*4;
        int b = z/400*400;
        int c = z/100*100;
        if (a < z) System.out.println("количество дней в году: " + 365);
        else if (a >=z && b < z && c >= z) System.out.println("количество дней в году: " + 365);
        else System.out.println("количество дней в году: " + 366);//напишите тут ваш код
    }
}