package com.javarush.task.task04.task0417;

/* Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2

1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

         if(a==b && b==c && a==c){
            System.out.print(a + " ");
            System.out.print(b+ " ");
            System.out.print(c);
        }
         else if (a==b){
            System.out.print(a+ " ");
            System.out.print(b+ " ");
        }
        else if (a==c){
            System.out.print(a+ " ");
            System.out.print(c+ " ");
        }
        else if (b==c){
            System.out.print(b+ " ");
            System.out.print(c+ " ");
        }
        else if(!(a==b && b==c && a==c)){
            System.out.print("");
        }
    }
}