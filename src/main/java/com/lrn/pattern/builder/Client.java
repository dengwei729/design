package com.lrn.pattern.builder;

/**
 * Created by dengwei on 16/11/6.
 */
public class Client {
    public static void main(String[] args) {
//        BenzModel benz = new BenzModel();
//
//        ArrayList<String> sequence = new ArrayList<String>();
//        sequence.add("engine boom");
//        sequence.add("start");
//        sequence.add("stop");
//        benz.setSequence(sequence);
//        benz.run();

        Director director = new Director();

        for (int i=0; i<1000; i++) {
            director.getABenzModel().run();
        }

        for (int i=0; i<1000000; i++) {
            director.getBBenzModel().run();
        }

        for (int i=0; i<10000000; i++) {
            director.getCBMWModel().run();
        }
    }
}
