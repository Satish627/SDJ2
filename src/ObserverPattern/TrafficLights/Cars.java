package ObserverPattern.TrafficLights;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Cars implements PropertyChangeListener
{
  private int id;
  private TrafficSignals trafficSignals;

  public Cars(int id,TrafficSignals trafficSignals) {
    this.id = id;
    this.trafficSignals=trafficSignals;
  }
  public Cars(){}


  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    String oldValue=(String) evt.getOldValue();
    String newValue=(String) evt.getNewValue();

    if("Green".equals(newValue)) {
      System.out.println("Car drives");
    } else if("Yellow".equals(newValue)) {
      if("Red".equals(oldValue)) {
        System.out.println("Car turns engine on");
      } else {
        System.out.println("Car slows down");
      }
    } else if("Red".equals(newValue)) {
      System.out.println("Car stops");
    }
  }
  }

