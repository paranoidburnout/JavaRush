package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).!
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> nulla = new ArrayList<>();
        Human child = new Human("ROSA", true, 22, nulla);
        Human child2 = new Human("CHERRBER", false, 18, nulla );
        Human child3 = new Human("ROY", false, 16, nulla);

        ArrayList<Human> childs= new ArrayList<>();
        childs.add(child);
        childs.add(child2);
        childs.add(child3);

        Human father = new Human("REBEKKA", true, 48, childs);
        Human mother = new Human("DIEGO", false, 58, childs);
        ArrayList<Human> parents1 = new ArrayList<>();
        parents1.add(father);
        ArrayList<Human> parents2 = new ArrayList<>();
        parents2.add(mother);

        Human grandfather1 = new Human("ALIBERT", true, 92, parents1);
        Human grandmother1 = new Human("ALIDA", false, 85, parents1);
        Human grandfather2 = new Human("LARETTA", true, 82, parents2);
        Human grandmother2 = new Human("LEO", false, 88, parents2);

        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name= name;
            this.sex= sex;
            this.age= age;
            this.children= children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
