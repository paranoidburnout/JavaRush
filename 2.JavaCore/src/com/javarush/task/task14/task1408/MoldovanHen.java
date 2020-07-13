package com.javarush.task.task14.task1408;
//<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
//где Sssss - название страны
//где N - количество яиц в месяц

public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}

