package Interfaces.TrafficLights;

public class TrafficSignals
{
  private String[] lights={"YELLOW","RED","YELLOW","GREEN"};
  private int count=2;
  private String currentLight;

  public TrafficSignals()
  {
    currentLight=lights[count];
  }
  public void start() throws InterruptedException
  {
    for (int i=0;i<10;i++){
      Thread.sleep(1000);
      count= (++count)%4;
      currentLight=lights[count];
      System.out.println("Light is " + currentLight);
    }
  }
}
