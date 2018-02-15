package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

//import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream(args[0]);
        byte[] buf=new byte[file.available()];
        if (file.available()>0){
            int count=file.read(buf);
        }
        file.close();
        int k=0;
        for (int i=0;i<buf.length;i++){
            if ((buf[i]>=65&&buf[i]<=90)||(buf[i]>=97&&buf[i]<=122)) k++;
        }
        System.out.print(k);
    }
}
