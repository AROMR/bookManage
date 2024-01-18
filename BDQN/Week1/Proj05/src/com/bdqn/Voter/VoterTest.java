package com.bdqn.Voter;

public class VoterTest {
    public static void main(String[] args) {


        for (int i = 0; i<=103; i++) {
            Voter voters = new Voter("选民"+i);
            voters.voteRule();

        }
    }



}
