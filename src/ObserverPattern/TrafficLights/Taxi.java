package ObserverPattern.TrafficLights;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Taxi implements PropertyChangeListener
{
  private int id;

  public Taxi(int id){
    this.id=id;
  }
  public Taxi(){}


  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    String newValue= (String) evt.getNewValue();
    String oldValue= (String) evt.getOldValue();
    if ("Green".equals(newValue))
    {
      System.out.println("Taxi drives super fast");
    }
    else if ("Red".equals(newValue))
    {
      System.out.println("Taxi stops with screething tires");
    }
  }
}

