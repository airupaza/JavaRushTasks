package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String familia;
        private int age;
        private int rost;
        private int ves;
        private int zarplata;
        public Human(String s){
            name=s;
        }
        public Human(String s1, String s2){
            name=s1; familia=s2;
        }
        public Human(int x){
            age=x;
        }
        public Human(String s, int x){
            name=s; age=x;
        }
        public Human(String s1, String s2, int x){
            name=s1; familia=s2; age=x;
        }
        public Human(int x1,int x2){
            age=x1; rost=x2;
        }
        public Human(int x1, int x2,int x3){
            age=x1;
            rost=x2;
            ves=x3;
        }
        public Human(int x1, int x2,int x3, int x4){
            age=x1;
            rost=x2;
            ves=x3;
            zarplata=x4;
        }
        public Human(String s, int x1, int x2){
            name=s; age=x1; rost=x2;
        }
        public Human(String s, int x1, int x2, int x3){
            name=s; age=x1; rost=x2; ves=x3;
        }
        // напишите тут ваши переменные и конструкторы
    }
}
