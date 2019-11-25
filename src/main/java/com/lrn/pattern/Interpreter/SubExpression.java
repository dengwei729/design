package com.lrn.pattern.Interpreter;

import java.util.HashMap;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 6:25 PM
 * @Version 1.0
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
