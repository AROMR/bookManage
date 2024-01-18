package com.bdqn.subject08.exer01;

public class Student {

/*
设计一个学生类
*/
//     1：属性有：姓名、Java成绩、android成绩、mysql成绩
//    2：所有属性要求使用private修饰。
    private String name;
    private double javaSore;
    private double androidSore;
    private double mysqlSore;

//      3：为每个属性设置setter和getter方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getJavaSore() {
        return javaSore;
    }

    public void setJavaSore(double javaSore) {
        this.javaSore = javaSore;
    }

    public double getAndroidSore() {
        return androidSore;
    }

    public void setAndroidSore(double androidSore) {
        this.androidSore = androidSore;
    }

    public double getMysqlSore() {
        return mysqlSore;
    }

    public void setMysqlSore(double mysqlSore) {
        this.mysqlSore = mysqlSore;
    }

    public Student() {
    }
//4：添加有为全部属性赋值的构造方法
    public Student(String name, double javaSore, double androidSore, double mysqlSore) {
        this.name = name;
        this.javaSore = javaSore;
        this.androidSore = androidSore;
        this.mysqlSore = mysqlSore;
    }

//5：有输出一个完整学生信息的方法
    public void printInfo(){
        System.out.println("学生姓名："+name+"，java成绩："+javaSore+"，android成绩："+androidSore+"，mysql成绩："+mysqlSore);
    }

//        6：要求可以求学生的总分、平均分、最高分、最低分。
    public void score(){
        double[] scoreArray = {javaSore,androidSore,mysqlSore};
        double sumScore = 0;
        double avgScore = 0;
        double max = scoreArray[0];
        double min = scoreArray[0];
        for (int i = 0; i < scoreArray.length; i++) {

            if (scoreArray[i]>max){
                max = scoreArray[i];
            }
            if(scoreArray[i]<min){
               min =  scoreArray[i];
            }
            sumScore+=scoreArray[i];
        }
        avgScore = sumScore/3;
        System.out.println(name+"学生的总分为："+sumScore+"，平均分"+avgScore+"，最高分为："+max+"，最低分为："+min);


    }



}