package logframework;

import logframework.data.LogLevel;
import logframework.logger.Logger;
import logframework.logger.LoggerFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Logger logger = LoggerFactory.getLogger();
        logger.log(LogLevel.ERROR, "DB query failed");
        logger.log(LogLevel.DEBUG,
                "Received an empty response");
    }

}
