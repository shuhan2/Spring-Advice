package thoughtworks.com.advicetest.AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Loggers {
    private static List<String> list = new ArrayList<>();

    public static void clear() {
        list.clear();
    }

    public static void logger(String name) {
        list.add(name);
    }
    static List<String> getLogs() {
        return list;
    }
}
