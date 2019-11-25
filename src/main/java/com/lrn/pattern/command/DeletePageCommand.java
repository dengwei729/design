package com.lrn.pattern.command;

/**
 * 增加需求的命令
 * Created by dengwei on 16/11/6.
 */
public class DeletePageCommand extends Command {
    @Override
    public void excute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
