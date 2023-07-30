package singleton;

import java.time.LocalDateTime;

public class LoggerSingleton {
    private static LoggerSingleton loggerSingletonInstance;

    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
        if (loggerSingletonInstance == null) {
            loggerSingletonInstance = new LoggerSingleton();
        }
        return loggerSingletonInstance;
    }

    public void log(Object object, String info){
        System.out.printf("Log info: %s - %s - %s", LocalDateTime.now(), object.getClass(), info);
    }
}
