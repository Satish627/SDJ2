package MultiThreading.Monitor;

import java.util.Random;

public class ColorUser implements Runnable
{
  private static final Random random = new Random();
  private ColorMonitor colors;
  private int no;

  public ColorUser(ColorMonitor colors, int no)
  {
    this.colors = colors;
    this.no = no;
  }

  @Override public void run()
  {
    while (true)
    {
      try
      {
        Thread.sleep(random.nextInt(5000));
      }
      catch (InterruptedException e)
      {
      }
      System.out.println("Thread #" + no + " wants a color");
      String c= colors.getColor();

      System.out.println("Thread #" + no + " get a color " + c);

      try
      {
        Thread.sleep(10000);
      }
      catch (InterruptedException e)
      {
      }
      System.out.println("Thread #" + no + " return a color " + c);
      colors.returnColor(c);

    }
  }
}
