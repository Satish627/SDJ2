package MVVM_ObserverPattern.TaskListExample.Model;

public class Task
{
  private String owner;
  private String description;
  private String timeCreated;

  public Task(String owner, String desc, String created)
  {
    this.owner = owner;
    desc = description;
    created = timeCreated;
  }
}
