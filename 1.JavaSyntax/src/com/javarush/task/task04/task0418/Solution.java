package com.javarush.task.task04.task0418;

/*
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.
Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран минимальное из двух целых чисел.
4. Если два числа равны между собой, необходимо вывести любое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        if (num1<num2) System.out.println(num1);
        else if (num2<num1) System.out.println(num2);
        else if (num1==num2){
            System.out.println(num1);

        }
    }
}