package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static class Man{
        String name;
        int age;
        String address;
        public Man(String name, int age, String address) {
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public void getMan(){
            System.out.println(name+" "+age+" "+address);
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;
        public Woman(String name, int age, String address) {
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public void getWoman(){
            System.out.println(name+" "+age+" "+address);
        }
    }
    public static void main(String[] args) {
        Man man1=new Man("Азат", 22, "Злобина");
        Man man2=new Man("Артур", 22, "Мингажева");
        Woman woman1=new Woman("Сабина", 22, "Ayskaya");
        Woman woman2=new Woman("Алия", 22, "Nizhegorodka");
        man1.getMan();
        man2.getMan();
        woman1.getWoman();
        woman2.getWoman();
        //напишите тут ваш код
    }
}
