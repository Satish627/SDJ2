package MVVM_ObserverPattern.TaskListExample.Model;

import java.beans.PropertyChangeListener;

public interface PropertyChangeSubject
{
  public void addPropertyListener(PropertyChangeListener listener);
  public void addPropertyListener( String eventName,PropertyChangeListener listener);
  public void removePropertyListener(PropertyChangeListener listener);
  public void removePropertyListener(String eventName,PropertyChangeListener listener);
}
