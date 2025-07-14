package com.lrn.dw.pattern.Interpreter;

import java.util.HashMap;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 6:21 PM
 * @Version 1.0
 */
public class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
