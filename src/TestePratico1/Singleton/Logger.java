package TestePratico1.Singleton;

public class Logger {
    private static Logger logger;

    private Logger() {
        System.out.println("logger created");
    }

    public static Logger getInstance(){
        if (logger == null){
        logger = new Logger();
        }
        return logger;
    }

    public void log(String msg){
        System.out.println(msg);
    }
}
