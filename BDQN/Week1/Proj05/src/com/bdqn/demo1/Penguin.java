package com.bdqn.demo1;

public class Penguin {
    private String name;
    private int health;
    private int love;
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public int getLove() {
        return love;
    }

    public void setName(String name) {


        this.name = name;
    }

    public void setHealth(int health) {
        if (health<0||health>100){
            System.out.println("你输入的健康值不合法，默认值为80");
            this.health = 80;
            return;
        }

        this.health = health;

    }

    public void setLove(int love) {
        if (love < 0 || love > 100) {
            System.out.println("你输入的亲密度值不合法，默认值为70");
            this.love = 70;
            return;
        }
        this.love = love;
    }

    public Penguin() {
    }
//包含全部参数的有参构造方法
    public Penguin(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }


    //
    public  void printInfo(){
        System.out.println("昵称："+name+"，健康值："+health+"，好感度："+love);
    }

}
