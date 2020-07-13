package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

1. Программа должна считывать имена 6 котов в указанном порядке.
2. Метод main должен создавать 6 объектов типа Cat.
3. Программа должна выводить 6 строк с информацией о котах.
4. Строка про дедушку (первая) должна соответствовать условию.
5. Строка про бабушку (вторая) должна соответствовать условию.
6. Строка про папу (третья) должна соответствовать условию.
7. Строка про маму (четвертая) должна соответствовать условию.
8. Строка про сына (пятая) должна соответствовать условию.
9. Строка про дочь (шестая) должна соответствовать условию.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String grandfatherName= reader.readLine();
        Cat grandfather= new Cat(grandfatherName, null, null);

        String grandmotherName=reader.readLine();
        Cat grandmother= new Cat(grandmotherName, null, null);

        String fatherName = reader.readLine();
        Cat father= new Cat(fatherName, null, grandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, grandmother, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, catMother, father);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, father);

        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(father);
        System.out.println(catMother);
        System.out.println(son);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

       public Cat(String name) {
            this.name = name;
        }

       public Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }
        public Cat(String name, Cat mother, Cat father){
            this.name=name;
            this.mother=mother;
            this.father=father;
        }

        @Override
        public String toString() {
                return "The cat's name is " + name + (mother == null?" , no mother" : "mother is " + mother.name) + (father == null? " , no father" : " , father is " + father.name);
        }
    }

}
