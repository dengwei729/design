package com.lrn.dw.pattern.command;

/**
 * Created by dengwei on 16/11/6.
 */
public class Client {
    public static void main(String[] args) {
        Invoker xiaosan = new Invoker();

        Command command = new AddRequirementCommand();
        xiaosan.setCommand(command);
        xiaosan.action();
    }
}
