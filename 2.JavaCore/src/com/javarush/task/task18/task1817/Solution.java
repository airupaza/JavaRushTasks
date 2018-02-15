package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        //args=new String[10];
       // args[0]="C:/Users/Азат/Desktop/test1.txt";
        FileInputStream file=new FileInputStream(args[0]);
        byte[] buf=new byte[file.available()];
        if (file.available()>0){
            int count=file.read(buf);
        }
        file.close();
        int k=0;
        for (int i=0;i<buf.length;i++){
            if (buf[i]==32) k++;
        }
        //System.out.println(k);
        float y=(float)(k)/buf.length;
       // System.out.println(y);
        System.out.print(String.format("%.2f", y*100.0 ));
    }
}
