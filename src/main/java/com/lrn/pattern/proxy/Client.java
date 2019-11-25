package com.lrn.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dengwei on 16/11/5.
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
//        IGamePlayer proxy = new GamePlayerProxy(player);
        // 强制代理
//        IGamePlayer proxy = player.getProxy();
        // 普通代理
//        IGamePlayer proxy = new GamePlayerProxy("张三");

        // 动态代理
        InvocationHandler handler = new GamePlayerH(player);
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println("开始时间是: " + df.format(new Date()));
//        player.login("zhangshan", "password");
//        player.killBoss();
//        player.upgrade();

        proxy.login("zhangshan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是: " + df.format(new Date()));

    }
}
