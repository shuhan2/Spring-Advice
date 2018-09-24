package thoughtworks.com.advicetest.AOP;

import org.springframework.stereotype.Component;


@Component
public class InvokerMethod {


    public void beforeTest() {
        Loggers.logger("beforeJointPoint");
    }


    public void afterTest() {
        Loggers.logger("afterJointPoint");

    }

    public Object returnTest() {
        Loggers.logger("returnJointPoint");
        return "returnJointPoint";
    }
}
