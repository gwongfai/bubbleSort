package com.zgh;

import cn.hutool.core.convert.Convert;

import java.util.Date;

public class HuToolTest {
    public static void main(String[] args) {
        convertTest();



    }

    private static void convertTest() {
        int a = 1;
        String aStr = Convert.toStr(a);
        System.out.println(aStr);

        long[] b = {1, 2, 3, 4, 5, 6};
        String bStr = Convert.toStr(b);
        System.out.println(bStr);

        String date = "2017-05-06";
        Date value = Convert.toDate(date);
        System.out.println(value);
    }

}
