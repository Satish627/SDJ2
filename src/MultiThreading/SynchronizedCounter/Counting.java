package MultiThreading.SynchronizedCounter;

public class Counting
{
  public static void main(String[] args)
  {
    synchronizedCounter counter= new synchronizedCounter();

    Thread t1=new Thread( new CountingThread(counter));
    Thread t2=new Thread( new CountingThread(counter));

    t1.start();
    t2.start();

    System.out.println(counter.getCount());

  }

}
