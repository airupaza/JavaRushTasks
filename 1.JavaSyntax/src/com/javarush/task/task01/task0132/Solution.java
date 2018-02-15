package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
       int n1=(number-(number%100))/100;
       int n2=((number-(number%10))/10)%10;
       int n3=number%10;
       return n1+n2+n3;//напишите тут ваш код
    }
}