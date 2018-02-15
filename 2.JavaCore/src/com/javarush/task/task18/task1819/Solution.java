package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s1=reader.readLine();
        String s2=reader.readLine();
        FileInputStream file1=new FileInputStream(s1);
        byte[] buf3=new byte[file1.available()];
        if (file1.available()>0){
            int c=file1.read(buf3);
        }
        file1.close();
        FileInputStream file2=new FileInputStream(s2);
        byte[] buf2=new byte[file2.available()];
        if (file2.available()>0){
            int d=file2.read(buf2);
        }
        file2.close();
        byte[] buf=new byte[buf2.length+buf3.length];
        int j=0;
        for (int i=0;i<buf.length;i++) {
            if (i<buf2.length) buf[i]=buf2[i];
            else {buf[i]=buf3[j]; j++;}
        }
        FileOutputStream file3=new FileOutputStream(s1);
        file3.write(buf);
        file3.close();

    }
}
