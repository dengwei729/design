package com.lrn.dw.pattern.proxy;

/**
 * Created by dengwei on 16/11/5.
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }

    public GamePlayerProxy(String name) {
        try {
            this.gamePlayer = new GamePlayer(this, name);
        } catch (Exception e ) {
            // TODO 异常处理
        }
    }

    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    public IGamePlayer getProxy() {
        return this;
    }

    public void count() {
        System.out.println("升级总费用是:150元");
    }
}
