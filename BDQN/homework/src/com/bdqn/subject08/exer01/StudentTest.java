package com.bdqn.subject08.exer01;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("张三",80,90,70);
        student1.printInfo();
        student1.score();
        System.out.println(student1.getName()+"-"+student1.getJavaSore()+"-"+student1.getAndroidSore()+"-"+student1.getMysqlSore());
        System.out.println("====================================");
        Student student2 = new Student();
        student2.setName("李四");
        student2.setJavaSore(100);
        student2.setAndroidSore(100);
        student2.setMysqlSore(100);
        student2.printInfo();
        student2.score();
    }
}
