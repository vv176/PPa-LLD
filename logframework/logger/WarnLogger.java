package logframework.logger;

import logframework.Publisher;
import logframework.data.LogLevel;

public class WarnLogger implements Logger{
    private final Logger nextLogger;
    private final Publisher logPublisher;

    public WarnLogger(Logger nextLogger, Publisher logPublisher) {
        this.nextLogger = nextLogger;
        this.logPublisher = logPublisher;
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if(logLevel.getLevel() == LogLevel.WARN.getLevel()) {
            this.logPublisher.notify(LogLevel.WARN + " " +message);
        }
        this.nextLogger.log(logLevel, message);
    }
}
