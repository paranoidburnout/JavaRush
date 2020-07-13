package com.javarush.task.task04.task0412;

/* 
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить число на экран.
3. Если введенное число положительное, необходимо увеличить его в два раза и вывести.
4. Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
5. Если введенное число равно нулю, необходимо вывести ноль.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String numer = reader.readLine();
        int nummer = Integer.parseInt(numer);

        if (nummer==0) System.out.println(0);
        if (nummer > 0){
            nummer = nummer*2;
            System.out.println(nummer);
        }
        if (nummer < 0){
            nummer = nummer+1;
            System.out.println(nummer);
        }

    }

}