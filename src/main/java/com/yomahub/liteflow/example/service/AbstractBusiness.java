package com.yomahub.liteflow.example.service;

public abstract class AbstractBusiness {

    public void execute() {
        this.component1();
        this.component2();
        this.component3();
    }

    public abstract void component1();

    public abstract void component2();


    public abstract void component3();

}
