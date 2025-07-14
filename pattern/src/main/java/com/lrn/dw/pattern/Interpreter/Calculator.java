package com.lrn.dw.pattern.Interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 6:26 PM
 * @Version 1.0
 */
public class Calculator {

    private Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<Expression>();
        char[] chars = expStr.toCharArray();

        Expression left = null;
        Expression right = null;

        for (int i=0; i<chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push((new AddExpression(left, right)));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
