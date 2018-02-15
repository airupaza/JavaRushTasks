package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        double sum=0;
        String s=reader.readLine();
        for (;;) {
            if (s.equals("сумма")) break;
            else{
                if ((Double.parseDouble(s)>0)||(Double.parseDouble(s)<=0)){
                    sum = sum + Double.parseDouble(s);
                    s = reader.readLine();
                }
            }
        }
        System.out.println(sum);//напишите тут ваш код
    }
}
