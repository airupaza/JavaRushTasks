package com.javarush.task.task08.task0815;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map=new HashMap<>();
        map.put("Абдуллин","Азат");
        map.put("Абдуллин","Альфред");
        map.put("Тимерханова","Сабина");
        map.put("Тимерханова","Камилла");
        map.put("Тимерханова","Лира");
        map.put("Тимерханов","Айдар");
        map.put("Тимерханов","Азат");
        map.put("Абдуллин","Азат");
        map.put("Кудрявцева","Овца");
        map.put("Кудрявцева","Коза");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int k=0;
        for (Map.Entry<String, String> pair:map.entrySet())
            if (pair.getKey().equals(name)) k++;
        return k;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int k=0;
        for (Map.Entry<String, String> pair:map.entrySet())
            if (pair.getValue().equals(lastName)) k++;
        return k;

    }

    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(), "Тимерханова"));
    }
}
