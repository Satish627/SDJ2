package ObserverPattern.TrafficLights;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class TrafficSignals implements PropertyChangeSubject
{
  private String[] lights = {"Green", "Yellow", "Red", "Yellow"};
  private int count = 2;
  private String currentLight;
  private PropertyChangeSupport subject;
  public TrafficSignals()
  {
    currentLight = lights[count];
    subject= new PropertyChangeSupport(this);
  }



  public void start() throws InterruptedException
  {
    for (int i = 0; i < 10; i++)
    {String previous="";
      Thread.sleep(1000);
      count = (++count) % 4;
      currentLight = lights[count];
      System.out.println("\nLight is " + currentLight);

      subject.firePropertyChange("LightChanged",previous,currentLight);
    }

  }

  @Override public void addPropertyChangeListener(String eventName,
      PropertyChangeListener listener)
  {
    if(eventName.equals(null)||" ".equals(eventName) ){}
    else subject.addPropertyChangeListener(eventName,listener);
  }
  @Override public void removePropertyChangeListener(String eventName,
                                                     PropertyChangeListener listener)
  {
    if(eventName.equals(null)||" ".equals(eventName) ){}
    else subject.removePropertyChangeListener(eventName,listener);
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
     subject.addPropertyChangeListener(listener);
  }
  @Override public void removePropertyChangeListener(
          PropertyChangeListener listener)
  {
    subject.removePropertyChangeListener(listener);
  }



}
