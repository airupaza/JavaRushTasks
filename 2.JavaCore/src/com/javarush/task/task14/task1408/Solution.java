package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country=="Russia") return new RussianHen();
            else if (country=="Ukraine") return new UkrainianHen();
            else if (country=="Moldova") return new MoldovanHen();
            else return new BelarusianHen();
        }
    }


}
