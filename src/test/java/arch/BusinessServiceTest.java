package arch;


import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.example.Application;
import com.yomahub.liteflow.example.service.SubBusiness;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class BusinessServiceTest {

    @Autowired
    private SubBusiness subBusiness;

    @Resource
    private FlowExecutor flowExecutor;

    @Test
    public void testExecute() {
        subBusiness.execute();
    }

    @Test
    public void testLiteFlowBusiness() {
        try {
            flowExecutor.execute("businessService", null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
