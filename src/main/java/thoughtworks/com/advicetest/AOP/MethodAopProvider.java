package thoughtworks.com.advicetest.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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


}
