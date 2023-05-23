package logframework.logger;

import logframework.ConsoleSubscriber;
import logframework.FileSubscriber;
import logframework.LogPublisher;
import logframework.Publisher;

import java.io.IOException;

public class LoggerFactory {
    private LoggerFactory() {}
    public static Logger getLogger() throws IOException {
        Publisher debugInfoPub = new LogPublisher();
        debugInfoPub.subscribe(new ConsoleSubscriber());
        Publisher warnAndAbovePub = new LogPublisher();
        warnAndAbovePub.subscribe(new ConsoleSubscriber());
        warnAndAbovePub.subscribe(new FileSubscriber("log.txt"));
        return new DebugLogger(new InfoLogger(
                new WarnLogger(new ErrorLogger(new AnalyticsLogger(
                       new FatalLogger(new IdleLogger(), warnAndAbovePub),
                        warnAndAbovePub
                ), warnAndAbovePub), warnAndAbovePub),
                debugInfoPub),debugInfoPub);
    }
}
