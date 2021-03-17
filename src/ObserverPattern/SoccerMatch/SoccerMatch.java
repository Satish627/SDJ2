package ObserverPattern.SoccerMatch;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class SoccerMatch implements PropertyChangeSubject
{
  private String team0 = "Dream Team";
  private String team1 = "Old Boys";

  private PropertyChangeSupport support= new PropertyChangeSupport(this);
  private int dreamTeamScore;
  private int oldBoyScore;
  private int dtTackles;
  private int obTackles;

  public void startMatch() {
    System.out.println("Match starting \n\n");
    Random random = new Random();
    for(int i = 0; i < 90; i++) {

      int rand = random.nextInt(100);
      int whichTeam = random.nextInt(2);

      if(rand < 8) {
        // score goal
        scoreGoal(whichTeam);
      } else if(rand < 12) {
        // penalty
        roughTackle(whichTeam);
      }

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        break;
      }
    }

    System.out.println("\n\nMatch ended");
  }

  private void roughTackle(int whichTeam) {
    if(whichTeam == 0) {
      System.out.println("Dream team makes foul");
     int dtTacklePrev=dtTackles;
     dtTackles++;
      support.firePropertyChange("dreamTeamTackle",dtTacklePrev,dtTackles);
      // TODO team0 made a rough tackle
    } else {
      System.out.println("Old boys makes foul");
      int obTacklePrev=obTackles;
      obTackles++;
      support.firePropertyChange("OldBoysTackle",obTacklePrev,obTackles);
      // TODO team1 made a rough tackle
    }
  }

  private void scoreGoal(int whichTeam) {
    if(whichTeam == 0) {
      int dreamTeamPreviousScore= dreamTeamScore;
      dreamTeamScore++;
      System.out.println("Dream Team scored");
      support.firePropertyChange("DreamTeamScore",dreamTeamPreviousScore,dreamTeamScore);
      // TODO team0 scored
    } else {
      int obPreviousScore=oldBoyScore;
      oldBoyScore++;

      System.out.println("Old boys scored");
      support.firePropertyChange("OldBoysScore",obPreviousScore,oldBoyScore);
      // TODO team1 scored
    }
  }

  @Override public void addPropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(name,listener);
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
  support.addPropertyChangeListener(listener);
  }

  @Override public void removePropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(name,listener);
  }

  @Override public void removePropertyChangeListener(
      PropertyChangeListener listener)
  {
  support.removePropertyChangeListener(listener);
  }
}
