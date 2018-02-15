package com.javarush.task.task14.task1421;

public class Singleton {
    private static int k=0;
    private static Singleton instance;
    public static Singleton getInstance(){
        if (k==0) {
            k=k+1;
            instance=new Singleton();
            return instance;
        }
        else return instance;
    }

    private Singleton() {
    }
}
