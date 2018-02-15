package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileReader fread=new FileReader(reader.readLine());
        FileWriter fwrite=new FileWriter(reader.readLine());
        reader.close();
        int i=1;
        while (fread.ready()){
            int data=fread.read();
            if (i%2==0) fwrite.write(data);
            i++;
        }
        fread.close();
        fwrite.close();

    }
}
