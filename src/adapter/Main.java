package adapter;

public class Main {
    static void main() {
        LegacyLogger legacy = new LegacyLogger();
        Logger logger = new LegacyLoggerAdapter(legacy);
        Application app = new Application(logger);
        app.run();
    }
}
