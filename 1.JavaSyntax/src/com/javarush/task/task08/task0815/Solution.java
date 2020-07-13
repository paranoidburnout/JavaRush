package com.javarush.task.task08.task0815;

import javafx.beans.binding.MapBinding;

import java.util.HashMap;
import java.util.Map;

/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("фамилия" + i, "имя" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countName=0;
        for (Map.Entry<String, String> mapN : map.entrySet()){
            if(mapN.getValue().equals(name)){
                countName++;
            }
        }
        return countName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countLastName =0;
        for (Map.Entry<String, String> mapL : map.entrySet()){
            if(mapL.getKey().equals(lastName)){
                countLastName++;
            }
        }
        return countLastName;

    }

    public static void main(String[] args) {

    }
}
