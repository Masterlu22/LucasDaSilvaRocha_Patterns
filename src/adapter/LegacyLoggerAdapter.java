package adapter;

public class LegacyLoggerAdapter implements Logger {
    private final LegacyLogger legacy;

    public LegacyLoggerAdapter(LegacyLogger legacy) {
        this.legacy = legacy;
    }

    @Override
    public void info(String message) {
        this.legacy.log("INFO", message);
    }

    @Override
    public void error(String message) {
        this.legacy.log("ERROR", message);
    }
}
