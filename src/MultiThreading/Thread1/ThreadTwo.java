package MultiThreading.Thread1;

public class ThreadTwo implements Runnable
{
  private static final int No_Of_Repetitions=10;
  private static final int Max_Wait= 1500;
  @Override public void run()
  {
    for (int i=0;i<No_Of_Repetitions;i++){
      System.out.println("We are on the runway" + i);
      try
      {
        Thread.sleep(Max_Wait);
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }

  }
}
