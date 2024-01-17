package com.bdqn.demo1;

public class PenguinTest {
    public static void main(String[] args) {

        Penguin penguin1 = new Penguin();

        penguin1.setName("QQ");
        penguin1.setLove(100);
        penguin1.setHealth(100);

        System.out.println(penguin1.getName());
        System.out.println(penguin1.getHealth());
        System.out.println(penguin1.getLove());

        penguin1.printInfo();
        System.out.println("======================");
        Penguin penguin2 = new Penguin();
        penguin2.setName("WeChat");
        penguin2.setLove(-100);
        penguin2.setHealth(-100);

        System.out.println(penguin2.getName());
        System.out.println(penguin2.getHealth());
        System.out.println(penguin2.getLove());

//使用有参构造方法输入数据，判断数据是否合法
    Penguin penguin3 = new Penguin("TT",-10,79);
    penguin3.printInfo();


    }
}
