package MultiThreading.TrafficLights;

public class Pedestrian
{
  private int id;

  public Pedestrian(int id)
  {
    this.id = id;
  }

  public void setLight(String currentLight)
  {
    if ("Green".equals(currentLight))
    {
      System.out.println("Pedestrian" + id + " waits ");
    }
    else if ("Red".equals(currentLight))
    {
      System.out.println("Pedestrian" + id + " walks ");
    }

  }
}
