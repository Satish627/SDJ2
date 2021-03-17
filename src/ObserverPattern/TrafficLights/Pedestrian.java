package ObserverPattern.TrafficLights;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Pedestrian implements PropertyChangeListener
{
  private int id;

  public Pedestrian( ){};



  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    String newValue=(String) evt.getNewValue();
    String oldValue=(String) evt.getOldValue();
    if ("Green".equals(newValue))
    {
      System.out.println("Pedestrian waits ");
    }
    else if ("Red".equals(newValue))
    {
      System.out.println("Pedestrian walks ");
    }
  }
}
