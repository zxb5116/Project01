package com.guigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    private int num;

    public static void main(String[] args){
        ArrayList list =new ArrayList();

        System.out.println("Hello world!");
        Date date = new Date();
    }

    public  void method(){
        num = 10;

        try {
            FileInputStream fsse =new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();

    }

}
