package logframework.logger;

import logframework.data.LogLevel;

public interface Logger {
    void log(LogLevel logLevel, String message);
}
