package com.zgh;

public class MyFibonacci {
    public static void main(String[] args) {
        int[] a=new int[20];
        //数据19位值的数据，也就是20项的结果
        fun1(a);
    }
    /**
     * 数组写法
     */
    public static  void fun1(int[] a){
        a[0]=1;
        a[1]=1;
        for(int i=2;i<a.length;i++){
            a[i]=a[i-1]+a[i-2];
        }
        //打印结果
        System.out.println(a[a.length-1]);
    }
}
