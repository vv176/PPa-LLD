package logframework.logger;

import logframework.Publisher;
import logframework.data.LogLevel;

public class FatalLogger implements Logger{
    private final Logger nextLogger;
    private final Publisher logPublisher;

    public FatalLogger(Logger nextLogger, Publisher logPublisher) {
        this.nextLogger = nextLogger;
        this.logPublisher = logPublisher;
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if(logLevel.getLevel() == LogLevel.FATAL.getLevel()) {
            this.logPublisher.notify(LogLevel.FATAL + " " +message);
        }
        this.nextLogger.log(logLevel, message);
    }
}
