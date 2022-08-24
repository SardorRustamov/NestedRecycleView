package com.example.nestedrecycleview.model;

import java.util.List;

public class ChildModelClass {
    public int image;
    public List<Model_gs> model_gs;

    public ChildModelClass(int image, List<Model_gs> model_gs) {
        this.image = image;
        this.model_gs = model_gs;
    }
}
