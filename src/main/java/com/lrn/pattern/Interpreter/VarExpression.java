package com.lrn.pattern.Interpreter;

import java.util.HashMap;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 6:18 PM
 * @Version 1.0
 */
public class VarExpression extends Expression {
    private String key;
    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
