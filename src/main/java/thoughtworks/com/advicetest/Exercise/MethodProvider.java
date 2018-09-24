package thoughtworks.com.advicetest.Exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import thoughtworks.com.advicetest.AOP.Loggers;

@Component
public class MethodProvider {

    @Autowired
    private Loggers logger;
    public void  methodProvider() {

    }

    public void method1() {
        logger.logger("method1");

    }

    public void method2() {
        logger.logger("method2");


    }
    public void method3() {
        logger.logger("method3");


    }
}
