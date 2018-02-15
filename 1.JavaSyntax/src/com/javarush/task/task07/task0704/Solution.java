package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader( new InputStreamReader(System.in));
        int[] mas=new int[10];
        for (int i=0;i<10;i++)
            mas[i]=Integer.parseInt(reader.readLine());
        int count = 9;
        int k;
        for (int i=0;i<5;i++){
            k=mas[i];
            mas[i]=mas[i+count];
            mas[i+count]=k;
            count=count-2;
        }
        for (int i=0;i<10;i++)
            System.out.println(mas[i]);

        //напишите тут ваш код
    }
}

