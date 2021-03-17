package Singleton;


public class LogLine {

  private String logEntry;

  public LogLine(String log, String format) {
    logEntry = format + " " + log;
  }

  public String getLogEntry() {
    return logEntry;
  }
}