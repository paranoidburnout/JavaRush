package com.javarush.task.task08.task0807;

/*
Нужно создать два списка - LinkedList и ArrayList.
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна содержать только три метода.
4. Метод createArrayList() должен создавать и возвращать список ArrayList.
5. Метод createLinkedList() должен создавать и возвращать список LinkedList.
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static Object createArrayList() {
        ArrayList<String> list= new ArrayList<>();
        return list;

    }

    public static Object createLinkedList() {
        LinkedList<String> linklist= new LinkedList<String>();
        return linklist;
    }

    public static void main(String[] args) {
        createLinkedList();
        createArrayList();
    }
}
