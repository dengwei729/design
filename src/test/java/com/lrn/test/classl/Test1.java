package com.lrn.test.classl;

public class Test1 extends Test {
    @Override
    public void test() {
        super.test();
        System.out.println("test1");
    }

    public static void main(String[] args)  {
        Test1 test1 = new Test1();
        test1.test();
    }
}
