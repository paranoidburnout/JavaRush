package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int [3];

        numbers [0] = Integer.parseInt(reader.readLine());
        numbers [1] = Integer.parseInt(reader.readLine());
        numbers [2] = Integer.parseInt(reader.readLine());

        int k;
        for (int i= 0; i<numbers.length; i++){
            for(int j=i; j<numbers.length;j++ ){
                if (numbers[j]>numbers[i]){
                    k= numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=k;
                }
            }
        }
        for(int i=0; i<numbers.length; i++) System.out.println(numbers[i] + " ");
    }
}
