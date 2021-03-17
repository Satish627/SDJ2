package ObserverPattern.TrafficLightExample;

public class RunTrafficLight
{
  public static void main(String[] args) throws InterruptedException
  {
    TrafficLight trafficLight= new TrafficLight();
    Car1 car1= new Car1();
    trafficLight.addPropertyChangeListener("LightChanged",car1);

    Car2 car2= new Car2(trafficLight);

    Car3 car3= new Car3(trafficLight);

    Car4 car4= new Car4(trafficLight);
    trafficLight.start();
  }
}
