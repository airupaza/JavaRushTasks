package com.javarush.task.task19.task1910;

/* 
Пунктуация
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
        String strLine=fread.readLine();
        while (strLine!=null){
            strLine=strLine.replaceAll("\\W","");
            fwrite.write(strLine);
            strLine=fread.readLine();
        }
        fread.close();
        fwrite.close();
    }
}
