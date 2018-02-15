package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s=reader.readLine();
            if (s.equals("exit")) break;
            else{
                new ReadThread(s).start();
            }

        }
    }

    public static class ReadThread extends Thread
    {
        FileInputStream file;
        String s;
        public ReadThread(String fileName) throws FileNotFoundException {
            this.file=new FileInputStream(fileName);
            this.s=fileName;
        }
        public void run(){

            try {
                byte[] buf=new byte[this.file.available()];
                if (this.file.available()>0){
                    int count=this.file.read(buf);
                }
                this.file.close();
                HashMap<Byte, Integer> map=new HashMap<Byte, Integer>();
                for (int i=0;i<buf.length;i++){
                    if (!map.containsKey(buf[i])) map.put(buf[i], 1);
                    else map.computeIfPresent(buf[i], (k, v) -> v + 1);
                }
                int max=0;
                for (Map.Entry<Byte, Integer> entry : map.entrySet()){
                    if (max<entry.getValue()) max=entry.getValue();
                }
                for (Map.Entry<Byte, Integer> entry : map.entrySet())
                    if (entry.getValue()==max) Solution.resultMap.put(this.s, (int)entry.getKey());
            }
            catch (IOException e){}

        }
    }
}
