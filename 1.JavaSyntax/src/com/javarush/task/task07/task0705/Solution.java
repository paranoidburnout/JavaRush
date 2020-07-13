package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
1. Создать массив на 20 чисел.!
2. Ввести в него значения с клавиатуры.!
3. Создать два массива на 10 чисел каждый.!
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.


Требования:
1. Программа должна создавать большой массив на 20 целых чисел.
2. Программа должна считывать с клавиатуры 20 чисел для большого массива.
3. Программа должна создавать два маленьких массива на 10 чисел каждый.
4. Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] big= new int[20];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<big.length;i++){
            big[i]=Integer.parseInt(reader.readLine());
        }
        int[] small1= new int[10];
        int[] small2= new int[10];

        for(int i=0;i<small1.length; i++){
            small1[i]=big[i];
        }
        for(int i=0;i<small2.length;i++){
            small2[i]= big[i+10];
        }
        for(int i=0;i<small2.length;i++){
            System.out.println(small2[i]);
        }
    }
}
