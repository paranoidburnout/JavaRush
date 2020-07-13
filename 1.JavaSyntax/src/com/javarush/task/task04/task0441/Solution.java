package com.javarush.task.task04.task0441;

/*
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.

1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить среднее из трех чисел.
4. Если все числа равны, вывести любое из них.
5. Если два числа из трех равны, вывести любое из двух.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a, b, c= Integer.parseInt(reader.readLine());
        int max= Math.abs(Math.abs(a,b),c);
        if (a>b && a>c){
            System.out.println(b);
            return;
        }
        if (b>a && b>c){
            System.out.println(c);
        }
        if (c>a &&c>b){
            System.out.println(a);
        }
        if(a==b && a==c){
            System.out.println(a);
        }
        if (a==b && b<c){
            System.out.println(b);
        }

    }
}
