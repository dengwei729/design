package com.lrn.pattern.builder;

import java.util.ArrayList;

/**
 * Created by dengwei on 16/11/6.
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz  = new BenzModel();
    @Override
    public void setSequeue(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
