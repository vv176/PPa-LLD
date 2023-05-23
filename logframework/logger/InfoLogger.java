package logframework.logger;

import logframework.Publisher;
import logframework.data.LogLevel;

public class InfoLogger implements Logger{
    private final Logger nextLogger;
    private final Publisher logPublisher;

    public InfoLogger(Logger nextLogger, Publisher logPublisher) {
        this.nextLogger = nextLogger;
        this.logPublisher = logPublisher;
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if(logLevel.getLevel() == LogLevel.INFO.getLevel()) {
            this.logPublisher.notify(LogLevel.INFO + " " +message);
        }
        this.nextLogger.log(logLevel, message);
    }
}
