package com.javarush.task.task15.task1522;

import com.javarush.task.task14.task1421.Singleton;

public class Earth implements Planet{
    private static Earth instance;

    public static synchronized Earth getInstance(){
        if (instance ==null){
            instance = new Earth();
        }
        return instance;
    }
}
