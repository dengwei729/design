package com.lrn.dw.pattern.command;

/**
 * 增加需求的命令
 * Created by dengwei on 16/11/6.
 */
public class AddRequirementCommand extends Command {
    @Override
    public void excute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
