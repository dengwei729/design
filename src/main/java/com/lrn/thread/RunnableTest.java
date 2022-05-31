package com.lrn.thread;

/**
 * RunnableTest
 *
 * runnable没有返回值
 *
 * @author dw113073
 * @date 2022/05/31 11:42
 **/
public class RunnableTest implements Runnable {
    private String str;

    public RunnableTest(String str) {
        this.str = str;
    }
    @Override
    public void run() {
        try {
            //线程休眠5s，有异常产生，只能内部解决，无法向上抛
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5s之后输出
        System.out.println("hello:" + this.str);
    }
    public static void main(String[] args) {
        Runnable runnable = new RunnableTest("my runnable is ok");
        Long beginTime = System.currentTimeMillis();
        Thread thread=new Thread(()->{
            runnable.run();
        });
        thread.start();
        Long endTime = System.currentTimeMillis();
        //先输出
        System.out.println("time：" + (endTime-beginTime)/1000);
    }
}
