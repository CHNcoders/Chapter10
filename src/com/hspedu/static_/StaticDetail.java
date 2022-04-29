package com.hspedu.static_;

public class StaticDetail {
    public static void main(String[] args) {
        System.out.println(B.n1);

        //静态变量是类加载的时候就创建了，所以不需要创建对象
        //与类相关
    }
}

class B{
    public static int n1 = 100;
}