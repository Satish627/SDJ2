package Singleton;


import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    Log log = Log.getInstance();
    log.add("added test");
    log.add("edited test");
    Queue<LogLine> logLines = log.getAll();
    for (LogLine l :
        logLines) {
      System.out.println(l.getLogEntry());
    }
  }
}