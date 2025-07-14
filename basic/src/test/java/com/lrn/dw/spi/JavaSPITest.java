package com.lrn.dw.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

import org.junit.Test;

/**
 * @author dw113073.邓伟
 * @since 2025/7/14 15:49
 * @date 2025/07/14
 */
public class JavaSPITest {
    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        // 1. forEach 模式
        serviceLoader.forEach(Robot::sayHello);
        // 2. 迭代器模式
        Iterator<Robot> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            Robot robot = iterator.next();
            System.out.println(robot);
            robot.sayHello();
        }
    }

}
