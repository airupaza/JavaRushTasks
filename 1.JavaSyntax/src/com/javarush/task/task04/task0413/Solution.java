package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nedely = reader.readLine();
        int numb = Integer.parseInt(nedely);
        if (numb == 1)
            System.out.println("понедельник");
        if (numb == 2)
            System.out.println("вторник");
        if (numb == 3)
            System.out.println("среда");
        if (numb == 4)
            System.out.println("четверг");
        if (numb == 5)
            System.out.println("пятница");
        if (numb == 6)
            System.out.println("суббота");
        if (numb == 7)
            System.out.println("воскресенье");
        if (numb > 7 || numb < 1)
            System.out.println("такого дня недели не существует");
        //напишите тут ваш код
    }
}