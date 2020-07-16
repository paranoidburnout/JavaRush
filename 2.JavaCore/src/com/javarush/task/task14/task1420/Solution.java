package com.javarush.task.task14.task1420;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       long number1 = Long.parseLong(reader.readLine());
       if (number1<=0) throw new Exception();
       long number2 = Long.parseLong(reader.readLine());
       if (number2<=0) throw new Exception();
        System.out.println(NOD(number1,number2));
    }
    public static long NOD(long number1, long number2){
        while (number2!=0 && number1!=0){
            long NOD = number1%number2;
            number1=number2;
            number2=NOD;
        }
        return number1;
    }
}
/*
Второй рабочий способ, но который не подходит для решения JavaRush по условию. Хотя со своей задачей отлично спровляется, можете сами проверить.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = reader.readLine();
        String string2 = reader.readLine();
        int number1 = Integer.parseInt(string1);
        int number2 = Integer.parseInt(string2);
        while (number1!=0 && number2!=0 && number1!=number2){
            if (number1>number2){
                number1=number1-number2;
                System.out.println(number1);
                break;
            }
            else if (number2>number1){
                number2= number2-number1;
                System.out.println(number2);
                break;

            }
        }
    }
}
*/