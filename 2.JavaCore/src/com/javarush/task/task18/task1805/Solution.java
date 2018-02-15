package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file=new FileInputStream(reader.readLine());
        ArrayList<Integer> list=new ArrayList<Integer>();
        while (file.available()>0){

                boolean flag=false;
                int x=file.read();
                for (int i=0;i<list.size();i++){
                    if (x==list.get(i)) flag=true;
                }
                if (flag==false) list.add(x);

        }
        file.close();
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { return o1 - o2; }
        });
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
