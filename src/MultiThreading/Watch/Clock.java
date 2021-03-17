package MultiThreading.Watch;

import javax.swing.*;

public class Clock
{
  public static void main(String[] args)
  {
    Time time = new Time();
    Thread up = new Thread(new Update(time));
    Thread dis = new Thread(new Display(time));

    up.start();
    dis.start();

    while (true)
    {
      String newTime= JOptionPane.showInputDialog(null,"New Time");
      time.setTime(Integer.parseInt(newTime));
    }

  }
}
