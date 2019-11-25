package com.lrn.pattern.command;

/**
 * 抽象命令类
 * Created by dengwei on 16/11/6.
 */
public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    // 只有一个方法,你要做什么事
    public abstract void excute();
}
