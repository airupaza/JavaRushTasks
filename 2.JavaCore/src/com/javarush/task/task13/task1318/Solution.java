package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));// напишите тут ваш код
        InputStream input = new FileInputStream(reader.readLine());
        while (input.available()>0)
            System.out.print((char)input.read());
        System.out.println();
        reader.close();
        input.close();

    }
}