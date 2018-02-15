package com.javarush.task.task10.task1014;

/* 
Расставьте минимум static-ов
*/

public class Solution {
    public int A = 5;
    public int B = 5;
    public int C = 5;
    public static int D = 5;

    public static void main(String[] args) {


        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}
