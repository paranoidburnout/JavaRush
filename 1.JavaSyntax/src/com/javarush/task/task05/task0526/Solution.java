package com.javarush.task.task05.task0526;

/*
1. Внутри класса Solution создай public static классы Man и Woman.!
2. У классов должны быть поля: name (String), age (int), address (String).!
3. Создай конструкторы, в которые передаются все возможные параметры.!
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
1. В классе Solution создай public static класс Man.!
2. В классе Solution создай public static класс Woman.!
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).!
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).!
5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.!
6. Конструкторы должны инициализировать переменные класса.
7. В методе main необходимо создать по два объекта каждого типа.
8. Метод main должен выводить созданные объекты на экран в указанном формате.
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 =new Man("Nikolas", 29, "Scharchorßtrasse7");
        Man man2= new Man("Kolya", 25, "Shuwalova");

        Woman woman = new Woman("Elithabeth", 21, "Scharchorßtrasse7");
        Woman woman2= new Woman("Liza", 17,"PoltavskyProezd2");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman.name + " " + woman.age + " " + woman2.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name= name;
            this.age=age;
            this.address=address;
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name= name;
            this.age=age;
            this.address=address;
        }
    }
}