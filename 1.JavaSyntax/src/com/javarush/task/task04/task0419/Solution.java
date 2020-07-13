package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.
        if ((num1>num2)&&(num1>num3)&&(num1>num4)) System.out.println(num1);
        else if  ((num2>num1)&&(num2>num3)&&(num2>num4)) System.out.println(num2);
        else if  ((num3>num1)&&(num3>num2)&&(num3>num4)) System.out.println(num3);
        else if  ((num4>num1)&&(num4>num2)&&(num4>num3)) System.out.println(num4);
        else if  ((num1==num2)&(num2==num3)&(num3==num4)&(num1==num3)&(num1==num4)&(num2==num4)) System.out.println(num1);
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());

        int maxab=Math.max(num1,num2);
        int maxcd=Math.max(num3,num4);
        System.out.println( Math.max(maxab,maxcd));

    }
}
