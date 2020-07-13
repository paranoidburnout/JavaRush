package com.javarush.task.task05.task0527;

/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.

1. Создай класс Dog.
2. Создай класс Cat.
3. В классе Dog должно быть три переменные.
4. В классе Cat должно быть три переменные.
5. Должен быть создан хотя бы один объект типа Mouse.
6. Должен быть создан хотя бы один объект типа Dog.
7. Должен быть создан хотя бы один объект типа Cat.
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Dog dogDog = new Dog("Dog", 1, 'm');

        Cat tomCat = new Cat("Tom", 2, 'm');
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

   public static class Dog{
        String name;
        int age;
        char sex;

        public Dog(String name, int age, char sex ){
            this.name= name;
            this.age=age;
            this.sex=sex;
        }
   }
    public static class Cat {
        String name;
        int age;
        char sex;

        public Cat (String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
