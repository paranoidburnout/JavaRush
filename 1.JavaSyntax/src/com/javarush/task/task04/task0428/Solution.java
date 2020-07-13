package com.javarush.task.task04.task0428;

/* 
Вывести на экран количество положительных чисел среди этих трех.
Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2

б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить количество положительных чисел в исходном наборе.
4. Если положительных чисел нет, программа должна вывести "0".
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int k =0;
        for (int i =0;i<3;i++){
            int num = Integer.parseInt(reader.readLine());
            if(num>0){
                k+=1;
            }
        }
        System.out.println(k);
    }
}
