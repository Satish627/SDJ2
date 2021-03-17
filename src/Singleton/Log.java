package Singleton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Log
{
  private Queue<LogLine> logQueue;
  private File logFile;
  private DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd  hh:mm:ss");

  private static Log instance;

  public static Log getInstance() {
    if (instance==null){
      instance = new Log();
    }
    return instance;
  }

  private Log()
  {
    logQueue = new LinkedList<>();
    Date date = Calendar.getInstance().getTime();
    String filename = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(date);
    logFile = new File(filename);
  }

  public synchronized void add(String log)
  {
    if (log == null || "".equals(log))
    {
      return;
    }
    logQueue.add(new LogLine(
        log,
        dateFormat.format(Calendar.getInstance().getTime())));
    addToFile(log);
    System.out.println(log);
  }

  public Queue<LogLine> getAll()
  {
    return logQueue;
  }

  private void addToFile(String log)
  {
    if (log == null)
    {
      return;
    }
    BufferedWriter out = null;
    try
    {
      out = new BufferedWriter(new FileWriter(logFile, true));
      out.write(log + "\n");
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        out.close();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
  }
}