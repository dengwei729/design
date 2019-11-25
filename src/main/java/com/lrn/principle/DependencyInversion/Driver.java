package com.lrn.principle.DependencyInversion;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/22 10:55 PM
 * @Version 1.0
 */
public class Driver implements IDriver {
    public void driver(ICar car) {
        car.run();
    }
}
