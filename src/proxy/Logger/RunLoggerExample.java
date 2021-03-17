package proxy.Logger;

public class RunLoggerExample {
    public static void main(String[] args) {
        Logger logger=new LogLevelController(LogLevelController.LOG_LEVEL.SPARESE,new ConsoleLogger());


        logger.log("Warning : Twilight is closed");
        logger.log("Warning : Mother in law approaching");
        logger.log("Error : Ran out of cola");
    }
}
