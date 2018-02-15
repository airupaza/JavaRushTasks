package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
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
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int i=0;i<list.size();i++){
            if (!map.containsKey(list.get(i))) map.put(list.get(i), 1);
            else map.computeIfPresent(list.get(i), (k, v) -> v + 1);
        }
        int min=100;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (min>entry.getValue()) min=entry.getValue();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (min==entry.getValue()) System.out.print(entry.getKey()+" ");
        }
    }
}
