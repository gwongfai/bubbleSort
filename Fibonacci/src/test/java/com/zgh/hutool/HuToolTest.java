package com.zgh.hutool;

import cn.hutool.core.convert.Convert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class HuToolTest {

    @Test
    public void convertTest() {
        //Object转换为字符串
        int a = 1;
        String aStr = Convert.toStr(a);
        System.out.println(aStr);

        //转换为指定类型数组
        long[] b = {1, 2, 3, 4, 5, 6};
        String bStr = Convert.toStr(b);
        System.out.println(bStr);

        //转换为日期对象
        String date = "2017-05-06";
        Date value = Convert.toDate(date);
        System.out.println(value);

        //转换为集合
        Object[] c = {"J","a","v","a","hello","world","，",5,6,9};
        List<?> list = Convert.toList(c);
        System.out.println(list);
    }



}
