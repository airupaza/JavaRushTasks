package com.javarush.task.task19.task1907;

/* 
Считаем слово C:/Users/Азат/Desktop/test1.txt
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader freader=new BufferedReader(new FileReader(reader.readLine()));
        String strLine=freader.readLine();
        Pattern pattern=Pattern.compile("\\bworld\\b");
        int sum=0;
        while (strLine!=null){
            Matcher m=pattern.matcher(strLine);
            while (m.find()) sum++;
            strLine=freader.readLine();
        }
        System.out.print(sum);
        freader.close();
        reader.close();
    }
}
