package MultiThreading.TrafficLights;

public class Taxi
{
  private int id;

  public Taxi(int id){
    this.id=id;
  }

  public void setLights(String currentLights)
  {
    if ("Green".equals(currentLights))
    {
      System.out.println("Taxi" + id + "drives super fast");
    }
    else if ("Red".equals(currentLights))
    {
      System.out.println("Taxi" + id + " stops with screething tires");
    }
  }
}

