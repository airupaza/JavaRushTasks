package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1=new FileInputStream(reader.readLine());
        FileOutputStream file2=new FileOutputStream(reader.readLine());
        byte[] buf1=new byte[file1.available()];
        int count=file1.read(buf1);
        byte[] buf2=new byte[count];
        int index=count-1;
        for (int i=0;i<count;i++){
            buf2[i]=buf1[index];
            index--;
        }
        file2.write(buf2);
        file1.close();
        file2.close();
        reader.close();
    }
}
