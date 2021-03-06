package MultiThreading.CounterThread1;

public class Counting
{

  public static void main(String[] args)
  {
    Counter counter= new Counter();
    Thread t1= new Thread(new CounterThread(counter));
    Thread t2= new Thread(new CounterThread(counter));

    t1.start();
    t2.start();

    try
    {
      t1.join();
      t2.join();
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
    System.out.println(counter.getValue());
  }

}
