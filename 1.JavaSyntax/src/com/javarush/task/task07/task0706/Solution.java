package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mas=new int[15];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<15;i++)
            mas[i]=Integer.parseInt(reader.readLine());
        int n1=0;
        int n2=0;
        for (int i=0;i<15;i++)
            if ((i==0)||(i%2==0)) n1=n1+mas[i];
            else n2=n2+mas[i];
        if (n1>n2) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");


        //напишите тут ваш код
    }
}
