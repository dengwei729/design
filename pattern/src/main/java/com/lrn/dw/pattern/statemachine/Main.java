package com.lrn.dw.pattern.statemachine;

import java.util.Scanner;

/**
 * Created by dengwei on 09/08/2017.
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        IPlayer player=new VedioPlayer();
        int i=-1;
        while((i=sc.nextInt())!=-1){
            player.request(i);
        }
    }
}
