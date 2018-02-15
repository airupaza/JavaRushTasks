package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 30;
    }
    public String getDescription(){
        return super.getDescription()+" Моя страна - Russia. Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
    //Моя страна - Sssss. Я несу N яиц в месяц.
}
