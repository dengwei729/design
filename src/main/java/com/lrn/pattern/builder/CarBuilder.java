package com.lrn.pattern.builder;

import java.util.ArrayList;

/**
 * Created by dengwei on 16/11/6.
 */
public abstract class CarBuilder {
    // 建造一个模型,你要给我一个顺序,就是组装顺序
    public abstract void setSequeue(ArrayList<String> sequence);
    // 设置完毕顺序后,就可以直接拿到这样车辆模型
    public abstract CarModel getCarModel();
}
