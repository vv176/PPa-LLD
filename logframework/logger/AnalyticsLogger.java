package logframework.logger;

import logframework.Publisher;
import logframework.data.LogLevel;

public class AnalyticsLogger implements Logger{

    private final Logger nextLogger;
    private final Publisher logPublisher;

    public AnalyticsLogger(Logger nextLogger, Publisher logPublisher) {
        this.nextLogger = nextLogger;
        this.logPublisher = logPublisher;
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if(logLevel.getLevel() == LogLevel.ERROR.getLevel()) {
            //
        }
        this.nextLogger.log(logLevel, message);
    }
}
