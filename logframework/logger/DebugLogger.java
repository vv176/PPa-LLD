package logframework.logger;

import logframework.Publisher;
import logframework.data.LogLevel;

public class DebugLogger implements Logger{

    private final Logger nextLogger;
    private final Publisher logPublisher;

    public DebugLogger(Logger nextLogger, Publisher logPublisher) {
        this.nextLogger = nextLogger;
        this.logPublisher = logPublisher;
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if (logLevel.getLevel() == LogLevel.DEBUG.getLevel()) {
            this.logPublisher.notify(LogLevel.DEBUG + " " + message);
        }
        this.nextLogger.log(logLevel, message);
    }
}
