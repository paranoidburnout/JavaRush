package com.javarush.task.task07.task0711;

/*
1. Создай список строк.!
2. Добавь в него 5 строк с клавиатуры.!
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.

1. Объяви переменную типа список строк и сразу проинициализируй ee.!
2. Программа должна считывать 5 строк с клавиатуры.!
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<5; i++){
            list.add(reader.readLine());
        }
        String str;
        for(int i=0; i<13;i++){
            str=list.get(list.size()-1);
            list.add(0, str);
            list.remove((list.size()-1));
        }
        for(int i=0; i<5;i++){
            System.out.println(list.get(i));
        }

    }
}
