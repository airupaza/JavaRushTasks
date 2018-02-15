package com.javarush.task.task19.task1909;

/* 
Замена знаков C:/Users/Азат/Desktop/test1.txt
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1=reader.readLine();
        String fileName2=reader.readLine();
        reader.close();
        BufferedReader fread=new BufferedReader(new FileReader(fileName1));
        BufferedWriter fwrite=new BufferedWriter(new FileWriter(fileName2));
        while (fread.ready()){
            int ch=fread.read();
            if (ch==46) ch=33;
            fwrite.write(ch);
        }
        fread.close();
        fwrite.close();
    }
}
