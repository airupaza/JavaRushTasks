package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int count=0;
        byte[] buf=new byte[file.available()];
        if (file.available()>0){
            count=file.read(buf);
        }
        file.close();
        int kol=0;
        for (int i=0;i<count;i++){
            if (buf[i]==44) kol++;
        }
        System.out.print(kol);
    }
}
