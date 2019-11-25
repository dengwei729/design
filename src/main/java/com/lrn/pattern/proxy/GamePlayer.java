package com.lrn.pattern.proxy;

/**
 * Created by dengwei on 16/11/5.
 */
public class GamePlayer implements IGamePlayer {
    private  String name = "";
    // 我的代理是谁
    private IGamePlayer proxy = null;
    // 通过构造函数传递名称
    public GamePlayer(String name) {
        this.name = name;
    }

    // 构造函数限制谁能创建对象,并同时传递姓名
    public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception {
        if (_gamePlayer == null) {
            throw new Exception("不能创建真实角色");
        } else {
            this.name = name;
        }
    }

    // 找到自己的代理
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    // 打怪,最期望的就是杀老怪
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪~");
        } else {
            System.out.println("请使用指定的代理访问");
        }

    }

    // 进游戏之前你肯定要登录吧,这是一个必要条件
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为 " + user + "的用户" +  this.name + "登录成功~");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    // 升级,升级有很多方法,花钱买是一种,做任务也是一种
    public void upgrade() {
        if (isProxy()) {
            System.out.println(this.name + "又升了一级");
        } else {
            System.out.println("请使用指定的代理访问");
        }

    }

    // 校验是否是代理访问
    public boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
