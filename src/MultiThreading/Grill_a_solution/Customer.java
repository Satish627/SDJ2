package MultiThreading.Grill_a_solution;

import java.util.Random;

public class Customer implements Runnable
{
  private static final int MAX_WAIT_TIME=12000;
  private static final int MAX_BURGERS=3;

  private static final  Random random = new Random();

  private int custNo;
  private Grill grill;

  public Customer(int custNo, Grill grill)
  {
    this.custNo = custNo;
    this.grill = grill;
  }

  @Override public void run()
  {
    try
    {
      Thread.sleep(MAX_WAIT_TIME);
    }
    catch (InterruptedException e)
    {
    }
    int noOfBurgers= 1+ random.nextInt(MAX_BURGERS);

    System.out.println("Customer #" + custNo + " wants " + noOfBurgers + " burger(s).");

    grill.buyBurgers(noOfBurgers);
    System.out.println("Customer# " + custNo + " got the burger(s).");
  }
}
