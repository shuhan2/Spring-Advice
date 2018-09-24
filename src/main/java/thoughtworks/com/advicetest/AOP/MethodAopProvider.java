package thoughtworks.com.advicetest.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodAopProvider {


    @Before("execution(* thoughtworks.com.advicetest.AOP.InvokerMethod.beforeTest()))")
    public void before() {
        Loggers.logger("before");
    }

    @After("execution(* thoughtworks.com.advicetest.AOP.InvokerMethod.afterTest()))")
    public void after() {
        Loggers.logger("after");

    }


}
