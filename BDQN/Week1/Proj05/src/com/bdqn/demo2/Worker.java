package com.bdqn.demo2;

public class Worker {
//使用private修饰，讲属性隐藏在类的内部
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private String phone;
    private String address;

//添加无参构造
    public Worker() {
    }
//添加有参构造
    public Worker(String name, int age, char gender, double height, double weight, String phone, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.phone = phone;
        this.address = address;
    }
//添加get/set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
