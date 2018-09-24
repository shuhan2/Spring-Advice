package thoughtworks.com.advicetest.AOP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AdviceTest {
    @Autowired
    WebApplicationContext context;

    @BeforeEach
    void setUp() {
        MockMvc mockMvc =  MockMvcBuilders.webAppContextSetup(context).build();
//        Loggers.clear();
    }

    @Autowired
    InvokerMethod invokerMethod;


    @Test
    void should_test_before_advice() {
        invokerMethod.beforeTest();
        assertEquals(Arrays.asList("before","beforeJointPoint"),Loggers.getLogs());
    }

    @Test
    void should_test_after_advice() {
        invokerMethod.afterTest();
        assertEquals(Arrays.asList("afterJointPoint","after"),Loggers.getLogs());

    }

    @Test
    void should_test_return_advice() {
        invokerMethod.returnTest();
        assertEquals(Arrays.asList("returnJointPoint", "return"),Loggers.getLogs());

    }
    @Test
    void should_test_returnWithVoid_advice() {
        invokerMethod.returnWithVoidTest();
        assertEquals(Arrays.asList("returnWithVoidJointPoint", "return"),Loggers.getLogs());
    }
    @Test
    void should_test_around_advice() {
//        invokerMethod.aroundTest();
    }
}
