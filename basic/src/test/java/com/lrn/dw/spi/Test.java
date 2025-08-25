package com.lrn.dw.spi;

import lombok.Setter;

/**
 * @author dw113073.邓伟
 * @since 2025/7/21 17:14
 * @date 2025/07/21
 */
public class Test {
    @Setter
    class Dw {
        private String name;
        private double age;

        @Override
        public String toString() {
            return String.format("姓名：%s;年龄：%s", name, age);
        }
    }

    @org.junit.Test
    public void test() {
        Dw dw = new Dw();
        dw.setName("dengwei");
        dw.setAge(18);
        System.out.println(dw);
    }
}
