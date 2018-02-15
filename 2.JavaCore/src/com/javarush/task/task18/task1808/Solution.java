package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1=new FileInputStream(reader.readLine());
        FileOutputStream file2=new FileOutputStream(reader.readLine());
        FileOutputStream file3=new FileOutputStream(reader.readLine());
        byte[] buf=new byte[file1.available()];
        int count=0;
        if (file1.available()>0){
            count=file1.read(buf);
            if (count%2==0){
                file2.write(buf,0,count/2);
                file3.write(buf,count/2, count/2);
            }
            else{
                file2.write(buf,0,(count+1)/2);
                file3.write(buf,(count+1)/2, (count-1)/2);
            }
        }

        file1.close();
        file2.close();
        file3.close();


    }
}
