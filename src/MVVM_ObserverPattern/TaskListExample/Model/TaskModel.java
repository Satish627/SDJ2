package MVVM_ObserverPattern.TaskListExample.Model;

public interface TaskModel extends PropertyChangeSubject
{
  public void addTask(String owner,String desc);
  public Task getTask();
}
