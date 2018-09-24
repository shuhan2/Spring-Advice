package thoughtworks.com.advicetest.Exercise;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import thoughtworks.com.advicetest.AOP.InvokerMethod;
import thoughtworks.com.advicetest.AOP.Loggers;

import static org.junit.Assert.assertEquals;
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvokerTest {


    @Autowired
    Loggers logger;

    @Autowired
    InvokerMethod invoker;

    @Test
    public  void should_add_log_before_call_method() {
//        invoker.invoker();
//        assertEquals(3, logger.getLogs().size());
    }
}
