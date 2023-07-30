package singleton;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        BigDecimal bigDecimal = BigDecimal.ONE;
        LoggerSingleton.getInstance().log(bigDecimal, "some test info");
    }
}
