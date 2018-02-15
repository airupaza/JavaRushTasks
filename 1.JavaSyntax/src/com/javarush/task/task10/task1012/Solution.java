package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int[] num=new int[33];
        for (int i = 0; i < 33; i++)
            num[i]=0;


        String word="";
        for (int i = 0; i < 10; i++)
            word=word+list.get(i);
        char[] str=word.toCharArray();

        for (int i = 0; i < word.length(); i++){
            for (int j = 0; j < 33; j++)
                if (str[i]==abcArray[j]) num[j]++;
        }

        for (int i = 0; i < 33; i++)
            System.out.println(abcArray[i]+" "+num[i]);
        // напишите тут ваш код
    }

}
