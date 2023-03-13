package com.zgh;

public class MyFibonacci2 {
    public static void main(String[] args) throws Exception {
        int a = fbnq(20);
        System.out.println(a);
    }

    private static int fbnq(int i) throws Exception {
        if (i==0){
            throw new Exception("参数异常");
        }
        if (i==1||i==2){
            return 1;
        }else {
            return fbnq(i-1)+fbnq(i-2);
        }
    }
}
