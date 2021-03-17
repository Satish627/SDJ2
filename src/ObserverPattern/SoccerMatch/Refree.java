package ObserverPattern.SoccerMatch;

public class Refree
{
  public Refree(PropertyChangeSubject subject){

    subject.addPropertyChangeListener("dreamTeamTackle",evt -> showYellowCard());
    subject.addPropertyChangeListener("OldBoysTackle",evt -> showYellowCard());
  }

  private void showYellowCard()
  {
    System.out.println("Refree shows yellow card");
  }
}
