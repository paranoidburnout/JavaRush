package com.javarush.task.task07.task0724;

/*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).

Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.



1. Программа не должна считывать данные с клавиатуры.!
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).!
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).!
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).!
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Human human1= new Human("DD",false,75);
        Human human2= new Human("FF", false, 85);
        Human human3= new Human("AA", true, 70);
        Human human4= new Human("BB",true,62);
        Human human5= new Human("NIK", false, 37, human1,human2);
        Human human6= new Human("Eli", true, 29, human3,human4);
        Human human7= new Human("C", false,7,human5,human6);
        Human human8= new Human("B", false,1,human5,human6);
        Human human9= new Human("A",false,4,human5,human6);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex,int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }
        public Human(String name, boolean sex,int age, Human father,Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}