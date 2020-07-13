package com.javarush.task.task07.task0702;

/*
1. Создать массив на 10 строк.!
2. Ввести с клавиатуры 8 строк и сохранить их в массив.!
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
1. Программа должна создавать массив на 10 строк.
2. Программа должна считывать 8 строк для массива с клавиатуры.
3. Программа должна выводить на экран 10 строк, каждую с новой строки.
4. Программа должна выводить на экран массив (10 элементов) в обратном порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] list= new String[10];
        int n =list.length;

       for(int i=2;i<list.length;i++){
            String s= reader.readLine();
            list[i]=s;
        }
       for(int i=9; i>=0; i--){
           System.out.println(list[i]);
       }
    }
}