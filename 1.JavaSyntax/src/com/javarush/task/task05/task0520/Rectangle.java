package com.javarush.task.task05.task0520;

/*
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.

- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)

1. У класса Rectangle должны быть переменные top, left, width и height с типом int.
2. У класса должен быть хотя бы один конструктор.
3. У класса должно быть хотя бы два конструктора.
4. У класса должно быть хотя бы три конструктора.
5. У класса должно быть хотя бы четыре конструктора.
*/


public class Rectangle {
   public int top,left, width, height;
    public Rectangle(int top,int left,int width,int height){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }
    public Rectangle(int top,int left){
        this.top=top;
        this.left=left;
        this.width=0;
        this.height=0;
    }
    public Rectangle(int top,int left,int width){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=width;
    }
    public Rectangle(Rectangle rec){
        this.top=rec.top;
        this.left=rec.left;
        this.width=rec.width;
        this.height=rec.height;
    }


    public static void main(String[] args) {

    }
}
