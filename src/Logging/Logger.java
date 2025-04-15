package Logging;

public class Logger {
    private Device device;

    public Logger(Device device) {
        this.device = device;
    }

    public void log(Level level, String message) {
        String logMsg = "[" + level + "] " + message;

        if(device == Device.STDERR) {
            System.err.println(logMsg);
        }else {
            System.out.println(logMsg);
        }
    }
}
