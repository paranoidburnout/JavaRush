package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
В статическом блоке инициализировать labels 5 различными парами ключ-значение.


Требования:
1. В классе Solution должен быть только один метод (main).!
2. В классе Solution должно быть объявлено статическое поле labels типа Map.!
3. Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
4. Метод main должен выводить содержимое labels на экран.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(200D, "Adidas");
        labels.put(220D, "Nike");
        labels.put(185D, "KC");
        labels.put(100D, "J&N");
        labels.put(180D, "Konvers");
    }


    public static void main(String[] args) {
        System.out.println(labels);
    }
}
