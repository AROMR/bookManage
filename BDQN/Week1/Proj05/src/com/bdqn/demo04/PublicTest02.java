package com.bdqn.demo04;
//import com.bdqn.demo03.PublicClass01;
import com.bdqn.demo03.PublicClass02;

public class PublicTest02 {
    public static void main(String[] args) {

        //默认的访问修饰符只能在同包中访问
        //PublicClass01 publicClass01 = new PublicClass01();
        //使用public修饰的类可以在不同包中进行访问
        PublicClass02 publicClass02 = new PublicClass02();
    }
}
