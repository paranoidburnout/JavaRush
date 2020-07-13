package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё следующие строки:
арбуз
банан
вишня
груша

ежевика
женьшень
земляника
ирис


Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.

1. Объяви переменную коллекции Set с типом элементов String и сразу проинициализируй ee.
2. Программа не должна считывать строки с клавиатуры.
3. Программа должна добавлять в коллекцию 10 строк, согласно условию.
4. Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.

*/

public class Solution {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String text = iterator.next();

            System.out.println(text);
        }
    }
}
