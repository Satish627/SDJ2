package ObserverPattern.TrafficLightExample;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Car2
{
  public Car2(PropertyChangeSubject subject){
    PropertyChangeListener listener= new PropertyChangeListener()
    {
      @Override public void propertyChange(PropertyChangeEvent evt)//anonymous implementation of interface
      {
        reactToEvent(evt);
      }
    };
    subject.addPropertyChangeListener("lightChanged",listener);
  }
  public void reactToEvent(PropertyChangeEvent evt)
  {
    String oldValue = (String) evt.getOldValue();
    String newValue = (String) evt.getNewValue();

    if (newValue.equals("GREEN")){
      System.out.println("Car2 drives.");
    }
    else if (newValue.equals("YELLOW")){
      if (oldValue.equals("RED")){
        System.out.println("Car2 starts engine.");
      }
      else
        System.out.println("Car2 slows down.");
    }
    else if(newValue.equals("RED")){
      System.out.println("Car2 stops.");
    }

  }

}
