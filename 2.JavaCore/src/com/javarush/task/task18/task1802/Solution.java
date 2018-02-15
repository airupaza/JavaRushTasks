package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file=new FileInputStream(reader.readLine());
        ArrayList<Integer> list=new ArrayList<>();
        while (file.available()>0){
            list.add(file.read());
        }
        file.close();
        reader.close();
        int min=list.get(0);
        for (int i=1;i<list.size();i++)
            if (min>list.get(i)) min=list.get(i);
        System.out.print(min);
    }
}
