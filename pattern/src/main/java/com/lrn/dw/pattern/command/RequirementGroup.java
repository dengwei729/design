package com.lrn.dw.pattern.command;

/**
 * 需求组
 * Created by dengwei on 16/11/6.
 */
public class RequirementGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到需求组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项需求...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项需求...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项需求...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求需求变更计划...");
    }
}
