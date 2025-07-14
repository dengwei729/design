package com.lrn.dw.pattern.builder;

import java.util.ArrayList;

/**
 * Created by dengwei on 16/11/6.
 */
public class BmwBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();
    @Override
    public void setSequeue(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
