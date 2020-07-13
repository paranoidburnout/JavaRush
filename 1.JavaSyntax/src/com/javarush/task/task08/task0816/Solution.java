package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

1. Программа не должна выводить текст на экран.!
2. Программа не должна считывать значения с клавиатуры.!
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлон", dateFormat.parse("YUNE 2 2012"));
        map.put("Сталло", dateFormat.parse("YUNE 3 2012"));
        map.put("Сталл", dateFormat.parse("YUNE 14 2012"));
        map.put("Стал", dateFormat.parse("YULY 10 2012"));
        map.put("Ста", dateFormat.parse("AUGUST 21 2012"));
        map.put("Ст", dateFormat.parse("MAY 18 2012"));
        map.put("С", dateFormat.parse("SEPTEMBER 22 2012"));
        map.put("Се", dateFormat.parse("DECEMBER 23 2012"));
        map.put("Сне", dateFormat.parse("MAY 9 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator= map.entrySet().iterator();


            Map.Entry<String, Date> tm = iterator.next();
            int month = tm.getValue().getMonth();
            if((month>=5) && (month<=7)){
                iterator.remove();
            }
        }



    public static void main(String[] args) {

    }
}
