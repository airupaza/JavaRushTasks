package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list=new ArrayList<>();
        for (int i=0;i<10;i++)
            list.add(reader.readLine());// Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> result = doubleValues(list);

        for (int i=0;i<result.size();i++)
            System.out.println(result.get(i));// Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        int k=0;
        while (k<list.size()) {
            list.add(k + 1, list.get(k));
            k = k + 2;
        }
        return list;
    }
}
