package MultiThreading.TrafficLights;

public class Cars
{
  private int id;
  private String previousLight;

  public Cars(int id) {
    this.id = id;
  }

  private void lightChanged(String light) {

    if("GREEN".equals(light)) {
      System.out.println("Car " + id + " drives");
    } else if("YELLOW".equals(light)) {
      if("RED".equals(previousLight)) {
        System.out.println("Car " + id + " turns engine on");
      } else {
        System.out.println("Car " + id + " slows down");
      }
    } else if("RED".equals(light)) {
      System.out.println("Car " + id + " stops");
    }
    previousLight = light;
  }
}
