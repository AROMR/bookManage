package com.bdqn.subject08.exer02;

public class Vehicle {
/*

    编写一个Java应用程序，设计一个汽车类Vehicle，包含的属性有车轮个数wheels和车重weight。
    每个类都有构造方法进行属性初识化和输出相关数据的方法；
    使用Test类中的main方法定义各类初始化数据后台打印相关数据

*/
    private int wheels;
    private double weight;

    public Vehicle() {
    }

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void printInfo(){
        System.out.println("车轮数为："+wheels+"，车重为："+weight+"t");
    }
}
