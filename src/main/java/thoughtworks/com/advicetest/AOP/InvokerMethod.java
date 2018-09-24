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

    public void returnWithVoidTest() {
        Loggers.logger("returnWithVoidJointPoint");
    }
    public void aroundWithVoidTest() {
        Loggers.logger("aroundWithVoidJointPoint");
    }

    public Object aroundWithReturnTest() {
        Loggers.logger("aroundWithReturnJointPoint");
        return "aroundWithReturnJointPoint";
    }

    public void afterThrowTest() {
        Loggers.logger("afterThrowJointPoint");
        throw new IllegalArgumentException();
    }

    public void afterThrowWithoutThrowTest() {
        Loggers.logger("afterThrowJointPointWithoutThrow");

    }
}
