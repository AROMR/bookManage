package com.bdqn.demo05;

public class Employee {
    public String name;
    protected int age;
    char gender;
    private String phone;//使用private修饰的变量只能在本类中进行访问，出了本类只能通过公共的get和set方法进行访问

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "张三";
        employee.age = 31;
        employee.gender = '男';
        employee.phone = "12345678909";
    }
}
