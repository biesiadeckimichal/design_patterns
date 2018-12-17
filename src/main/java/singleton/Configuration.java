package singleton;

public class Configuration {
    // domyslnym sposobem nadpisywania stalych w javie jest pisanie duzymi literami
    // w momwncie wywolania klasy configuration z automatu zostanie wywolane
    // new Configuration
    private static final Configuration INSTANCE = new Configuration();
    private logLevel logLevel;
    private String logPath;
    private String appState;
    private int callCount;

    private Configuration() {

    }

    public static Configuration getInstance() {
        return new Configuration();
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
