package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static{
        threads.add(new ThreadOne());
        threads.add(new ThreadTwo());
        threads.add(new ThreadThree());
        threads.add(new ThreadFour());
        threads.add(new ThreadFive());
    }

    public static void main(String[] args) {


    }
    public static class ThreadOne extends Thread{
        public void run(){
            for (;;){}
        }
    }

    public static class ThreadTwo extends Thread{
        public void run(){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThreadThree extends Thread{
        public void run(){
            try{
                while (true){
                    System.out.println("Ура");
                    this.sleep(500);
                }
            }
            catch (InterruptedException e){

            }
        }
    }

    public static class ThreadFour extends Thread implements Message{
        public static boolean flag=true;
        public void showWarning(){
            flag=false;
        }
        public void run(){
            while (flag){}
        }

    }

    public static class ThreadFive extends Thread{
        public static int sum=0;
        public void run(){
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            try{
                for(;;){
                    String s;
                    if ((s=reader.readLine()).equals("N")) break;
                    else sum=sum+Integer.parseInt(s);
                }
                System.out.println(sum);
            }
            catch (IOException e){}
        }
    }
}