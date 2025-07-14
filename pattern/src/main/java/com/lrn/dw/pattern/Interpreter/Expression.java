package com.lrn.dw.pattern.Interpreter;

import java.util.HashMap;

/**
 * @Decription 抽象表达式类
 * @Author dengwei
 * @Date 2019/11/23 6:17 PM
 * @Version 1.0
 */
public abstract class Expression {
    public abstract int interpreter(HashMap<String, Integer> var);
}
