package MultiThreading.Watch;

public class Display implements Runnable
{
  private static final int Display_time = 10;
  private static final long milliseconds = 1000L;
  private Time time;

  public Display(Time time)
  {
    this.time = time;
  }

  @Override public void run()
  {
    while (true)
    {
      time.display();

      try
      {
        Thread.sleep(Display_time * milliseconds);
      }
      catch (InterruptedException ex)
      {
      }
    }

  }
}

