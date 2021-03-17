package MVVM_ObserverPattern.TaskListExample.Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskModelManager implements TaskModel
{
   List<Task> tasks;
  private PropertyChangeSupport support= new PropertyChangeSupport(this);
  private ArrayList<Object> taskList;

  @Override public void addTask(String owner, String desc)
  {
    Task task= new Task(owner,desc,calcTimeStamp());
  }

  private String calcTimeStamp()
  {
    SimpleDateFormat sdfDate= new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
    Date now= new Date();
    return sdfDate.format(now);
  }

  @Override public Task getTask()
  {
    Task removedTask= (Task) taskList.remove(0);
    support.firePropertyChange("TaskRemoved",null,removedTask);
    return null;
  }

  @Override public void addPropertyListener(PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(listener);
  }

  @Override public void addPropertyListener(String eventName,
      PropertyChangeListener listener)
  {
  support.addPropertyChangeListener(eventName,listener);
  }

  @Override public void removePropertyListener(PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(listener);
  }

  @Override public void removePropertyListener(String eventName,
      PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(eventName,listener);
  }
}
