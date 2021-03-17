package MultiThreading.Monitor;

import java.util.ArrayList;

public class ColorMonitor
{
  private ArrayList<String> list = new ArrayList<String>();

  public ColorMonitor()
  {
    list.add("Red");
    list.add("Blue");
    list.add("Green");
  }



  public synchronized String getColor()
  {
    while (list.size() == 0)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {

      }

    }
    return list.remove(0);
  }
  public synchronized void returnColor(String c){
    list.add(c);
    notify();
  }

}
