package com.lrn.dw.pattern.proxy;

/**
 * Created by dengwei on 16/11/5.
 */
public interface IGamePlayer {
    // 登录游戏
    public void login(String user, String password);

    // 杀怪,网路游戏的主要特点
    public void killBoss();
    // 升级
    public void upgrade();

    // 每个人都可以找一下自己的代理
    // 强制代理用
    public IGamePlayer getProxy();
}
