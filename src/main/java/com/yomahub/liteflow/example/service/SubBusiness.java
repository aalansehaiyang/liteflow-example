package com.yomahub.liteflow.example.service;

import org.springframework.stereotype.Service;

@Service
public class SubBusiness extends AbstractBusiness {

    @Override
    public void component1() {
        System.out.println("SubBusiness component1");
    }

    @Override
    public void component2() {
        System.out.println("SubBusiness component2");
    }

    @Override
    public void component3() {
        System.out.println("SubBusiness component3");
    }
}
