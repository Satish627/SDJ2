package MultiThreading.Thread1;

public class ThreadOne implements Runnable
{
  private static final int No_Of_Repetitions=10;
  private static final int Max_Wait=2000;
  @Override public void run()
  {
    for (int i =0; i<No_Of_Repetitions;i++)
      System.out.println(" The eagle has landed " + i);

    try
      {
        Thread.sleep(Max_Wait);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
  }
}
