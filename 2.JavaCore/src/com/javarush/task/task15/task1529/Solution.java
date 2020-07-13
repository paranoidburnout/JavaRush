package com.javarush.task.task15.task1529;

/* 1. В отдельных файлах создать классы Plane и Helicopter, реализующие интерфейс CanFly.!
2. Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.!
3. В статическом методе reset класса Solution:
3.1. Считать с консоли параметр типа String.
3.2. Если параметр равен "helicopter", то статическому объекту CanFly result присвоить объект класса Helicopter.
3.3. Если параметр равен "plane", то считать второй параметр типа int(количество пассажиров), статическому объекту CanFly result присвоить объект класса Plane.
4. В статическом блоке инициализировать CanFly result вызвав метод reset.
5. Закрыть поток ввода методом close().

1. Класс Plane должен быть создан в отдельном файле и реализовывать интерфейс CanFly.!
2. Класс Helicopter должен быть создан в отдельном файле и реализовывать интерфейс CanFly.!
3. Класс Plane должен иметь конструктор с параметром int.!
4. В классе Solution должен быть реализован метод public static void reset().!
5. Метод reset должен считывать строки с клавиатуры.!
6. Если введенная строка равна "helicopter", в переменную result должен быть сохранен объект типа Helicopter.!
7. Если введенная строка равна "plane", в переменную result должен быть сохранен объект типа Plane.!
8. Поле result класса Solution должно быть инициализировано в статическом блоке путем вызова метода reset.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try{
            reset();}
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        if(string.equals("helicopter")){
            result = new Helicopter();
        }
        else if (string.equals("plane")){
            int PlaneCount =Integer.parseInt(reader.readLine());
            result= new Plane(PlaneCount);
        }

    }
}
