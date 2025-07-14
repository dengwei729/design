package com.lrn.dw.pattern.command;

/**
 * 负责人
 * Created by dengwei on 16/11/6.
 */
public class Invoker {
    // 什么命令
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void action() {
        this.command.excute();
    }
}
