package ObserverPattern.TrafficLights;

public class Display
{
 public static void main(String[] args) throws InterruptedException
 {
  TrafficSignals trafficSignals= new TrafficSignals();

  Cars cars= new Cars();
  trafficSignals.addPropertyChangeListener("LightChanged",cars);

  Taxi taxi=new Taxi();
  trafficSignals.addPropertyChangeListener("LightChanged",taxi);

  Pedestrian pedestrian= new Pedestrian();
  trafficSignals.addPropertyChangeListener("LightChanged",pedestrian);

  trafficSignals.start();
 }
}

