package com.javarush.task.task09.task0919;

/*
Создай метод public static void divideByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()

1. В классе должен быть метод public static void divideByZero().
2. Метод divideByZero должен содержать операцию деления любого целого числа на ноль.
3. Метод divideByZero должен вызывать System.out.println или System.out.print.
4. Метод main должен содержать блок try..catch.
5. Метод main должен отлавливать любые исключения метода divideByZero.
6. Программа должна выводить стек-трейс пойманого исключения.
*/

public class Solution {

    public static void main(String[] args) {
        try{
        divideByZero();}
        catch (ArithmeticException e){
           e.printStackTrace();
        }
    }
    public static void divideByZero(){
        int c=12/0;
        System.out.println(c);
    }
}
