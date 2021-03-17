package ObserverPattern.SoccerMatch;

import java.beans.PropertyChangeEvent;

public class OldBoysFan
{
  private int obGoals;
  private PropertyChangeSubject subject;

  public OldBoysFan(PropertyChangeSubject subject){
    this.subject=subject;
    subject.addPropertyChangeListener("OldBoysScore",evt -> cheer(evt));
    subject.addPropertyChangeListener("DreamTeamScore",evt -> buuh(evt));
  }

  private void cheer(PropertyChangeEvent evt)
  {
    obGoals=(int)evt.getNewValue();
    System.out.println("Old Boys Fans cheer");
  }
  private void buuh(PropertyChangeEvent evt){
    int dtGoals=(int)evt.getNewValue();
    System.out.println("Old boys fans buuhs");
    if (dtGoals>obGoals+1){
      System.out.println("Old boys fans rage quits");
    }
  }
  }

