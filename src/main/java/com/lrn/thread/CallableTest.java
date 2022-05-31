package com.lrn.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * CallableTest
 *
 * 实现callable接口的任务线程能返回执行结果
 * callable接口实现类中的run方法允许异常向上抛出，可以在内部处理，try catch，但是runnable接口实现类中run方法的异常必须在内部处理，不能抛出
 *
 * @author dw113073
 * @date 2022/05/31 11:34
 **/
public class CallableTest implements Callable<String> {
    private String string;

    public CallableTest(String string) {
        this.string = string;
    }

    @Override
    public String call() throws Exception {
        //任务阻塞5秒，异常向上抛出
        Thread.sleep(5000);
        return this.string;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new CallableTest("my callable is ok!");
        FutureTask<String> task = new FutureTask<String>(callable);
        long beginTime = System.currentTimeMillis();
        //创建线程
        new Thread(task).start();
        //调用get()方法阻塞主线程
        String str = task.get();
        long endTime = System.currentTimeMillis();
        System.out.println("hello :"+ str);
        System.out.println("time :"+ (endTime - beginTime)/1000);
    }
}
