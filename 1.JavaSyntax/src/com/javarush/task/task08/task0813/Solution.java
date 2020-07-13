package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/*
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
1. Не изменяй заголовок метода createSet().!
2. Программа не должна выводить текст на экран.!
3. Программа не должна считывать значения с клавиатуры.!
4. Метод createSet() должен создавать и возвращать множество (реализация HashSet).
5. Множество из метода createSet() должно содержать 20 слов на букву «Л».!
*/

public class Solution {
    public static Set<String> createSet() {
      Set<String> createSet= new HashSet<>();

        createSet.add("ЛЮБИМКА");
        createSet.add("ЛИКБЕЗ");
        createSet.add("ЛИТЕРАТУРА");
        createSet.add("ЛИТЕРАЛЫ");
        createSet.add("ЛОЖЕ");
        createSet.add("ЛИХОЙ");
        createSet.add("ЛЕВЫЙ");
        createSet.add("ЛИБО");
        createSet.add("ЛЮТИК");
        createSet.add("ЛИБЕРАЛЫ");
        createSet.add("ЛЕНИН");
        createSet.add("ЛИВАН");
        createSet.add("ЛИВИЯ");
        createSet.add("ЛЫХНЫ");
        createSet.add("ЛОСОСЬ");
        createSet.add("ЛИСЫ");
        createSet.add("ЛИСИЧКИ");
        createSet.add("ЛЫЖИ");
        createSet.add("ЛОСКУТКИ");
        createSet.add("ЛАПЫ");
        return createSet;
    }

    public static void main(String[] args) {

    }
}
