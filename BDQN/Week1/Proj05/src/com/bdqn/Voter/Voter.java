package com.bdqn.Voter;

import javax.swing.plaf.IconUIResource;

public class Voter {
//    模拟实现选民投票过程：一群选民进行投票，每个选民只允许投一次票，并且当投票总数达到100时，就停止投票

    String name;
    static int ticket=0;
    public Voter(){

    }
    public Voter(String name) {
        this.name = name;
    }

    public void voteRule(){
        if (ticket<100){
            ticket++;
            System.out.println("已投"+ticket+"票，还剩"+(100-ticket)+"票");
        }else {
            System.out.println("投票已满");
        }


    }






}