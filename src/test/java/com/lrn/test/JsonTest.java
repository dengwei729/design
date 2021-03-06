package com.lrn.test;

import com.alibaba.fastjson.JSON;

import lombok.Data;

@Data
public class JsonTest {

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public static void main(String[] args) {
        String test = "{\"a\": \"a\",\"b\": \"b\", \"g\": \"g\"}";
        JsonTest jsonTest = JSON.parseObject(test, JsonTest.class);
        System.out.println(jsonTest);
    }
}
