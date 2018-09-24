package thoughtworks.com.advicetest.AOP;

import org.springframework.stereotype.Component;


@Component
public class InvokerMethod {


    public void beforeTest() {
        Loggers.logger("beforeTest");
    }


}
