package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter outWriter = new BufferedWriter(new FileWriter(consoleReader.readLine()));

        String text;

        do {
            text = consoleReader.readLine();
            outWriter.write(text);
            outWriter.newLine();

        } while (!text.equals("exit"));

        outWriter.close();
    }
}
