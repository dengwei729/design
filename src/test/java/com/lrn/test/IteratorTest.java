package com.lrn.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static class Model {
        private int i;
        public Model(int i) {
            this.i = i;
        }

        @Override
        public String toString() {
            return "Model{" +
                "i=" + i +
                '}';
        }
    }

    public static void main(String args[]) {
        //List<Model> models = new ArrayList<>();
        //models.add(new Model(1));
        //models.add(new Model(2));
        //models.add(new Model(3));
        //models.add(new Model(4));
        //
        //Iterator<Model> modelIterator = models.iterator();
        //Model model = modelIterator.next();
        //Model model1 = modelIterator.next();
        //System.out.println(model);
        //System.out.println(model1);
        //modelIterator.remove();
        //model = null;
        //System.out.println(model);

    }
}
