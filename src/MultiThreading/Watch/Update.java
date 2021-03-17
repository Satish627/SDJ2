package MultiThreading.Watch;

public class Update implements Runnable
{
  private static final int Update_time = 1;
  private static final long milliseconds = 1000L;

  private Time time;

  public Update(Time time)
  {
    this.time = time;
  }

  public void run()
  {
    while (true)
    {
      time.increment();

      try
      {
        Thread.sleep(Update_time * milliseconds);
      }
      catch (InterruptedException ex)
      {
      }
    }
  }

}
