package com.lrn.dw.pattern.Interpreter;

import java.util.HashMap;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 6:22 PM
 * @Version 1.0
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
