package thoughtworks.com.advicetest.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

    @AfterReturning("execution(* thoughtworks.com.advicetest.AOP.InvokerMethod.returnTest()))")
    public void returnMethod() {
        Loggers.logger("return");
    }

    @AfterReturning("execution(* thoughtworks.com.advicetest.AOP.InvokerMethod.returnWithVoidTest()))")
    public void returnWithVoidMethod() {
        Loggers.logger("return");
    }

    @Around("execution(* thoughtworks.com.advicetest.AOP.InvokerMethod.returnWithVoidTest()))")
    public void aroundWithVoidMethod() {
        Loggers.logger("aroundWithVoid");
    }
    @Around("execution(* thoughtworks.com.advicetest.AOP.InvokerMethod.aroundWithReturnTest()))")
    public void aroundWithReturnMethod() {
        Loggers.logger("aroundWithReturn");
    }
}

