package logframework.data;

public enum LogLevel {
    DEBUG(0),
    INFO(1),
    WARN(2),
    ERROR(3),
    FATAL(4);

    public int getLevel() {
        return level;
    }

    private final int level;

    LogLevel(int level) {
        this.level = level;
    }
}
