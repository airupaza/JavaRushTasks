package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

        String s;
        while ((s = fileReader.readLine()) != null) {
            Integer num = Integer.parseInt(s);
            if (num % 2.0 == 0) list.add(num);
        }

        reader.close();
        fileReader.close();

        Collections.sort(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }


    }
}
