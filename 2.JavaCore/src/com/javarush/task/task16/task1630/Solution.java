package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try{
            //System.out.print("Введите имя файла1: ");
            firstFileName=reader.readLine();
            //System.out.println();
            //System.out.print("Введите имя файла2: ");
            secondFileName=reader.readLine();
        }
        catch (IOException e){}
    }
    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String fileName;
        private String fileContent = "";
        @Override
        public void setFileName(String fullFileName) {
            this.fileName=fullFileName;
        }
        @Override
        public String getFileContent() {
            return this.fileContent;
        }
        public void run(){
            try{
                BufferedReader freader=new BufferedReader(new FileReader(new File(this.fileName)));
                String str;
                while ((str=freader.readLine())!=null){
                    this.fileContent+=str+" ";
                }
                freader.close();
            }
            catch (IOException e){}
        }
    }


}

