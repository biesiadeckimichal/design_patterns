package singleton;

public class ConfigurationDoubleChecker {
    private static ConfigurationDoubleChecker INSTANCE;
    private logLevel logLevel;
    private String logPath;
    private String appState;
    private int callCount;

    private ConfigurationDoubleChecker() {

    }

    public static ConfigurationDoubleChecker getInstance() {
        if (INSTANCE == null) {
            // synchronized broni blok kodu w nawiasach
            // tak ze mozna wykonywac tylko jeden watek na raz
            // poczytac o synchronized
            synchronized (INSTANCE) {
                if (INSTANCE)
            }
            INSTANCE = new ConfigurationDoubleChecker();
        }
        INSTANCE.callCount++;
        return INSTANCE;
    }

    public logLevel getLogLevel() {
        callCount++;
        return logLevel;
    }

    public void setLogLevel(logLevel logLevel) {
        callCount++;
        this.logLevel = logLevel;
    }

    public String getLogPath() {
        callCount++;
        return logPath;
    }

    public void setLogPath(String logPath) {
        callCount++;
        this.logPath = logPath;
    }

    public String getAppState() {
        callCount++;
        return appState;
    }

    public void setAppState(String appState) {
        callCount++;
        this.appState = appState;
    }

    public int getCallCount() {
        callCount++;
        return callCount;
    }

    public void setCallCount(int callCount) {
        callCount++;
        this.callCount = callCount;
    }
}
