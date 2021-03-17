package ObserverPattern.TrafficLightExample;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Car1 implements PropertyChangeListener
{
  private String name="Car1";

  public Car1(){}

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    String oldValue = (String) evt.getOldValue();
    String newValue = (String) evt.getNewValue();

    if (newValue.equals("GREEN")){
      System.out.println("Car1 drives.");
    }
    else if (newValue.equals("YELLOW")){
      if (oldValue.equals("RED")){
        System.out.println("Car1 starts engine.");
      }
      else
        System.out.println("Car1 slows down.");
    }
   else if(newValue.equals("RED")){
      System.out.println("Car1 stops.");
    }

  }

}
