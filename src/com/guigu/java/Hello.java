package com.guigu.java;

import com.guigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author zxb
 * @date 2018-07-23 023-15:51
 */
public class Hello {

    private static final Customer cust = new Customer();

    public static final int NUM = 1;
    public static final String NATION = "1";

    public static void main(String[] args) {
        System.out.println("Hello!");


        System.out.println("args = [" + args + "]");
        System.out.println("Hello.main");
        int num = 10;
        System.out.println("num = " + num);
        System.out.println("args = " + args);


        String[] arr = new String[]{"tom", "jerry", "lillei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);

        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(12312);
        list.add(123);


        for (Object o : list) {

        }

        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }


        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {


        }
        if (list == null) {

        }

    }
}
