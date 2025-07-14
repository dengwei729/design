package com.lrn.dw.pattern.builder;

import java.util.ArrayList;

/**
 * Created by dengwei on 16/11/6.
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<String >();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BmwBuilder bmvBuilder = new BmwBuilder();

    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequeue(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequeue(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    public BMWModel getCBMWModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmvBuilder.setSequeue(this.sequence);
        return (BMWModel)this.bmvBuilder.getCarModel();
    }

    public BMWModel getDBMWModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmvBuilder.setSequeue(this.sequence);
        return (BMWModel)this.bmvBuilder.getCarModel();
    }
}
