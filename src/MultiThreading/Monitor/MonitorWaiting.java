package MultiThreading.Monitor;

public class MonitorWaiting
{
  private static int NO_OF_THREADS = 6;

  public static void main(String[] args)
  {
    ColorMonitor colors = new ColorMonitor();

    for (int i = 0; i < NO_OF_THREADS; i++)
    {
      Thread t= new Thread(new ColorUser(colors,i));
      t.start();
    }
  }
}
