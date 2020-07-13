package com.javarush.task.task03.task0325;

/* Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час

1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное число n.
4. Выведенный тест должен полностью соответствовать заданию.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(reader.readLine());
        System.out.println("Я буду зарабатывать $"+n+" "+ "в час");
    }
}
