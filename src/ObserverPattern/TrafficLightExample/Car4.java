package ObserverPattern.TrafficLightExample;

import java.beans.PropertyChangeEvent;
//prefer this in sep2
public class Car4
{
  public Car4(PropertyChangeSubject subject){
    subject.addPropertyChangeListener("GREEN",this::reactToGreen);
    subject.addPropertyChangeListener("YELLOW",this::reactToYellow);
    subject.addPropertyChangeListener("RED",this::reactToRed);
  }

  private void reactToYellow(PropertyChangeEvent evt)
  { if (evt.getOldValue().equals("RED")){
    System.out.println("Car1 starts engine.");
  }
  else
    System.out.println("Car1 slows down.");
  }


  private void reactToGreen(PropertyChangeEvent evt)
  {
    System.out.println("Car4 drives.");
  }

  public void reactToRed(PropertyChangeEvent evt){
    System.out.println("Car4 stops. ");
  }



}
