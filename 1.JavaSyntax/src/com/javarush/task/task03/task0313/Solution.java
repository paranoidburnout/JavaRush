package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
Мама мыла раму
Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".

Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.

Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
1. Программа должна выводить текст.
2. Выведенный текст должен содержать 6 строк.
3. Текст в каждой строке должен быть уникален.
4. Должны быть выведены все возможные комбинации.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("МамаМылаРаму");
        System.out.println("МамаРамуМыла");
        System.out.println("МылаРамуМама");
        System.out.println("РамуМамаМыла");
        System.out.println("РамуМылаМама");
        System.out.println("МылаМамаРаму");

    }
}
