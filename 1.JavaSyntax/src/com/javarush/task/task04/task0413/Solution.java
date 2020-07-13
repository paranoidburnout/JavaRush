package com.javarush.task.task04.task0413;

/* 
День неделиВвести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numer = reader.readLine();
        int num = Integer.parseInt(numer);

        if(num ==1) System.out.println("понедельник");
        if ( num==2 ) System.out.println("вторник");
        if (num==3) System.out.println("среда");
        if (num==4) System.out.println("четверг");
        if (num==5) System.out.println("пятница");
        if (num==6) System.out.println("суббота");
        if (num==7) System.out.println("воскресенье");
        if ((num>7)||(num<1)) System.out.println("такого дня недели не существует");
    }
}