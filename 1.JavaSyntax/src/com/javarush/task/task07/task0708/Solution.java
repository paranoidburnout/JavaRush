package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> string = new ArrayList<String>();
        int max_str=0;

        for (int i=0;i<5;i++){
            String s= reader.readLine();
            int m = s.length();

            if(m>max_str) ;
            max_str=m;
            string.add(s);
        }
        for(int i=0; i<string.size();i++){
            if(string.get(i).length()==max_str)
                System.out.println(string.get(i));
        }
    }
}
