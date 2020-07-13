package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.
1. Программа должна считывать данные с клавиатуры.!
2. В программе должна быть объявлена переменная типа SimpleDateFormat.
3. В программе должна быть объявлена переменная типа Date.
4. Программа должна выводить данные на экран.
5. Вывод должен соответствовать заданию.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Date date= new Date();
        String read= reader.readLine();
        SimpleDateFormat oldSimpleDateFormat= new SimpleDateFormat("yyyy-MM-dd", Locale. ENGLISH);
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        try{
            date = oldSimpleDateFormat.parse(read);
            String simpleDate= simpleDateFormat.format(date);
            System.out.println(simpleDate.toUpperCase());}
        catch (ParseException e){
            System.out.println("ParseException");
        }

    }
}
