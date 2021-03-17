package ObserverPattern.TrafficLightExample;

import java.beans.PropertyChangeEvent;

public class Car3
{
  public Car3(PropertyChangeSubject subject){
    //anymous implementation using lamda expression
    subject.addPropertyChangeListener(this::reactToEvent);
  }
  public void reactToEvent(PropertyChangeEvent evt)
  {
    String oldValue = (String) evt.getOldValue();
    String newValue = (String) evt.getNewValue();

    if (newValue.equals("GREEN")){
      System.out.println("Car3 drives.");
    }
    else if (newValue.equals("YELLOW")){
      if (oldValue.equals("RED")){
        System.out.println("Car3 starts engine.");
      }
      else
        System.out.println("Car3 slows down.");
    }
    else if(newValue.equals("RED")){
      System.out.println("Car3 stops.");
    }

  }

}
