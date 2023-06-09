package com.yomahub.liteflow.example.component.business;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("bComponent")
public class BComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("SubBusiness component2");
    }
}
