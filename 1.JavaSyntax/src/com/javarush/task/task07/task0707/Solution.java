package com.javarush.task.task07.task0707;

/* 
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

1. Программа не должна ничего считывать с клавиатуры.
2. Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
3. Программа должна добавить 5 любых строк в список.
4. Программа должна вывести размер списка на экран.
5. Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list.size());
        for(int i=0;i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
