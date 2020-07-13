package com.javarush.task.task07.task0714;

/*
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
1. Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
2. Считай 5 строк с клавиатуры и добавь их в список.
3. Удали третий элемент списка.
4. Выведи элементы на экран, каждый с новой строки.
5. Порядок вывода должен быть обратный.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in)); // ввод с клавиатуры
        ArrayList<String> list = new ArrayList<>();// объявление переменной списко строк и ее инициализация
        for(int i=0; i<5;i++){ //цикл для 5 строк
            list.add(reader.readLine());//добавление через эд в список. который ввывелся с клавиатуры
        }
        list.remove(2);//remove в данном месте удаляет 3-ий элемент списка
        for(int i=list.size()-1; i>=0;i--){ //так работает обратный ввод списка. из листа
            System.out.println(list.get(i)); //
        }

    }
}
