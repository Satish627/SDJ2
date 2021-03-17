package MultiThreading.SynchronizedCounter;

public class CountingThread implements Runnable
{
  private static long value = 2000;
  private synchronizedCounter counter;

  public CountingThread(synchronizedCounter counter)
  {
    this.counter = counter;
  }

  @Override public void run()
  {
    for (int i = 0; i < value; i++)
    {
      counter.incrementer();
    }
  }
}
