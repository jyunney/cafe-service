package cafe.service.external;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class PGDemo {
    public Long startTransaction() {
        System.out.println("startTransaction");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Long approvalCode = new Random().nextLong();
        System.out.println("endTransaction. approvalCode : " + approvalCode);
        return approvalCode;
    }
}