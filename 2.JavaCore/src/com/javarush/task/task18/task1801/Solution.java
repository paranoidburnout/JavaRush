package com.javarush.task.task18.task1801;

/* Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.

1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int max =0;
        if (inputStream.available()>0)
            max=inputStream.read();
        while (inputStream.available()>0){
            int val = inputStream.read();
            if (max<val)
                max=val;
        }


        System.out.println(max);
        inputStream.close();
    }
}
