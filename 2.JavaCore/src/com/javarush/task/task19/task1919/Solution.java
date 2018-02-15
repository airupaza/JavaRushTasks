package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        args=new String[1];
        args[0]="C:/Users/Азат/Desktop/test1.txt";
        BufferedReader file=new BufferedReader(new FileReader(args[0]));// Создаем поток для чтения из файла
        HashMap<String,Double> map=new HashMap<>(); //создаем список hashMap
        while (file.ready()){ //проверяем есть ли в файле непрочимтанные данные
            String[] s=file.readLine().split(" "); //разбиваем считанную строку используя смивол пробела для разделителя
            if (s.length==2) //мы точно знаем, что строка должна делиться на 2 части, но на всякий случай проверяем это
            if (!map.containsKey(s[0])) map.put(s[0], Double.parseDouble(s[1])); //узнаем, соедржится ли в HashMap Такой же ключ, если не содержится добавляем его и устанавливаем соответствующее значение
            else for (Map.Entry entry: map.entrySet()){ // если содержится, то запускаем цикл для поиска ключа
                if (entry.getKey().equals(s[0])) map.put(s[0], (double)entry.getValue()+Double.parseDouble(s[1]));   //entry.setValue((double)entry.getValue()+ Double.parseDouble(s[1])); //если ключ найден, то прибавляем к уже имеющемуся значению текущее взятое из строки
            }
        }
        file.close(); //закрытие потока
        for (Map.Entry entry: map.entrySet()) System.out.println(entry.getKey()+" "+entry.getValue()); //вывод спсика HashMap
    }
}
