package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args)throws IOException {
        switch (args[0]){
            case "-e":{
                e(args[1],args[2]);
                break;
            }
            case "-d":{
                d(args[1],args[2]);
                break;
            }

        }
    }
    public static void e(String file1, String file2) throws IOException{
        FileInputStream f1=new FileInputStream(file1);
        FileOutputStream f2 = new FileOutputStream(file2);
        if (f1.available()>0){
            byte[] buf=new byte[f1.available()];
            int count=f1.read(buf);
            for (int i=0; i<buf.length;i++){
                buf[i]++;
            }
            f2.write(buf);
        }
        f1.close();
        f2.close();
    }
    public static void d(String file1, String file2) throws IOException{
        FileInputStream f1=new FileInputStream(file1);
        FileOutputStream f2 = new FileOutputStream(file2);
        if (f1.available()>0){
            byte[] buf=new byte[f1.available()];
            int count=f1.read(buf);
            for (int i=0; i<buf.length;i++){
                buf[i]--;
            }
            f2.write(buf);
        }
        f1.close();
        f2.close();
    }

}
