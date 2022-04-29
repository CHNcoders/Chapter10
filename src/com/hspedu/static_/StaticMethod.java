package com.hspedu.static_;

public class StaticMethod {
    public static void main(String[] args) {
        STU tom = new STU("Tom");
        tom.payFee(100);
        STU m = new STU("m");
        m.payFee(200);
        STU.showFee();
    }
}

class STU{
    private String name;
    //定义一个类变量，求学费
    //静态方法可以访问静态变量
    private static double fee = 0;

    public STU(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        STU.fee += fee;
    }
    public static void showFee(){
        System.out.println("总费用有" + STU.fee);
    }
}