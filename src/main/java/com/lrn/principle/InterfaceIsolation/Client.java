package com.lrn.principle.InterfaceIsolation;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 10:38 AM
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        IPettyGirl pettyGirl = new PettyGirl("妈妈");
        AbstractSearcher searcher = new Searcher(pettyGirl);
        searcher.show();
    }
}
