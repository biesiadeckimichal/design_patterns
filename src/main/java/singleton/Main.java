package singleton;


public class Main {
    public static void main(String[] args) {
        ConfigurationDoubleChecker instance1 = ConfigurationDoubleChecker.getInstance();
        System.out.println(instance1);
        instance1.setAppState("Running");
        instance1.setLogPath("C:/");
        instance1.setLogLevel(logLevel.DEBUG);
        System.out.println("Instance call count: " + instance1.getCallCount());

        ConfigurationDoubleChecker instance2 = ConfigurationDoubleChecker.getInstance();
        System.out.println(instance2);
        System.out.println("instance2 call count: " + instance2.getCallCount());
    }
}
