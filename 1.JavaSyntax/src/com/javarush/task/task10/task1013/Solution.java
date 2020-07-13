package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private String color;
        private String address;
        private int weight;


        public Human(int age){
            this.age=age;
        }
        public  Human(String name, int age, int weight){
            this.name=name;
            this.age=age;
            this.weight=weight;
        }
        public Human(boolean sex){
            this.sex=sex;
        }
        public Human(String color, String address){
            this.color=color;
            this.address=address;
        }
        public Human(String name, int weight){
            this.name= name;
            this.weight=weight;
        }
        public Human(int age, boolean sex, int weight){
            this.age= age;
            this.sex=sex;
            this.weight=weight;
        }
        public Human(int age, String address){
            this.age=age;
            this.address=address;
        }
        public  Human(boolean sex, String color){
            this.sex= sex;
            this.color= color;
        }
        public Human(int age, boolean sex){
            this.age= age;
            this.sex= sex;
        }
        public Human(String name, int age, boolean sex, String color, String address, int weight){
            this.name= name;
            this.age=age;
            this.sex= sex;
            this.color=color;
            this.address=address;
            this.weight = weight;
        }


    }
}
