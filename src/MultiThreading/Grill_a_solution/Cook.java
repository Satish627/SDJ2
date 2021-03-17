package MultiThreading.Grill_a_solution;

public class Cook implements Runnable
{
  private static final int PRODUCTION_TIME=6000;
  private Grill grill;
  private int cookNo;

  public Cook(Grill grill, int cookNo)
  {
    this.grill = grill;
    this.cookNo = cookNo;
  }

  @Override public void run()
  {
    System.out.println("Cook #" + cookNo + "  is ready.");
    while (true){

      grill.startProducing();
      System.out.println("Cook #" + cookNo + " starting producing a burger") ;
      try
      {
        Thread.sleep(PRODUCTION_TIME);
      }
      catch (InterruptedException e)
      {
      }
      System.out.println("Cook # " + cookNo + " has produced a burger and is ready.");
      grill.burgerCompleted();
    }

  }
}
