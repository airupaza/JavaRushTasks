package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file1=new FileOutputStream(reader.readLine());
        FileInputStream file2=new FileInputStream(reader.readLine());
        FileInputStream file3=new FileInputStream(reader.readLine());
         if (file2.available()>0&&file3.available()>0){
             byte[] buf2=new byte[file2.available()];
             byte[] buf3=new byte[file3.available()];
             int count1=file2.read(buf2);
             int count2=file3.read(buf3);
             file2.close();
             file3.close();
             byte[] buf=new byte[buf2.length+buf3.length];
             int j=0;
             for (int i=0;i<buf.length;i++) {
                 if (i<buf2.length) buf[i]=buf2[i];
                 else {buf[i]=buf3[j]; j++;}
             }
             file1.write(buf);
             file1.close();
             reader.close();
         }
         else {
             file2.close();
             file3.close();
             file1.close();
             reader.close();
         }
    }
}
