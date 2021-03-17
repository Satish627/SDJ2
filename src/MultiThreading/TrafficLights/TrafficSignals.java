package MultiThreading.TrafficLights;

import java.util.ArrayList;

public class TrafficSignals
{
  private String[] lights = {"Green", "Yellow", "Red", "Yellow"};
  private int count = 2;
  private String currentLight;
  private ArrayList<Cars> arraycars;

  public TrafficSignals()
  {
    currentLight = lights[count];
  }
  public TrafficSignals(ArrayList<Cars> arraycars){

  }

  public void start() throws InterruptedException
  {
    for (int i = 0; i < 10; i++)
    {
      Thread.sleep(1000);
      count = (++count) % 4;
      currentLight = lights[count];
      System.out.println("\nLight is " + currentLight);
    }

  }
}
