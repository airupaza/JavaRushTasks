package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] stroki=new String[10];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<10;i++)
            stroki[i]=reader.readLine();
        int[] dlina=new int[10];
        for (int i=0;i<10;i++)
            dlina[i]=stroki[i].length();
        for (int i=0;i<10;i++)
            System.out.println(dlina[i]);
        //напишите тут ваш код
    }
}
