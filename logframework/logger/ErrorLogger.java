package logframework.logger;

import logframework.Publisher;
import logframework.data.LogLevel;

public class ErrorLogger implements Logger{
    private final Logger nextLogger;
    private final Publisher logPublisher;

    public ErrorLogger(Logger nextLogger, Publisher logPublisher) {
        this.nextLogger = nextLogger;
        this.logPublisher = logPublisher;
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if(logLevel.getLevel() == LogLevel.ERROR.getLevel()) {
            this.logPublisher.notify(LogLevel.ERROR + " " +message);
        }
        this.nextLogger.log(logLevel, message);
    }
}
