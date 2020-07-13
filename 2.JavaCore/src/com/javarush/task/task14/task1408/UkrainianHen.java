package com.javarush.task.task14.task1408;
//<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
//где Sssss - название страны
//где N - количество яиц в месяц

public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}

