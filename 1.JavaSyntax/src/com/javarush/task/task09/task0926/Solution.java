package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.

1. Программа не должна считывать данные с клавиатуры.
2. Метод createList должен объявлять и инициализировать переменную типа ArrayList<int[]>.
3. Метод createList должен возвращать созданный список.
4. Метод createList должен добавлять в список 5 элементов.
5. Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2, следующих - 4, 7, 0 соответственно.
6. Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int []> createList= new ArrayList<>();
        int []arr = new int[5];
        for(int i=0; i<arr.length-1;i++){
            arr[i]=i+100;
        }
        int []arr1 = new int[2];
        for(int i=0; i<arr1.length-1;i++){
            arr1[i]=i+100;
        }
        int []arr2 = new int[4];
        for(int i=0; i<arr2.length-1;i++){
            arr2[i]=i+100;
        }
        int []arr3 = new int[7];
        for (int i=0; i<arr3.length-1;i++){
            arr3[i]=i+100;
        }
        int []arr4 = new int[0];
        for (int i=0; i<arr4.length-1;i++){
            arr4[i]=i+100;
        }
        arr = new int[]{1, 2, 3, 4, 5};
        arr1 = new int[]{1, 2};
        arr2 = new int[]{1, 2, 3, 4};
        arr3 = new int[]{1, 2, 3, 4, 5, 6, 7};
        arr4 = new int[]{};

        createList.add(arr);
        createList.add(arr1);
        createList.add(arr2);
        createList.add(arr3);
        createList.add(arr4);
        return createList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
