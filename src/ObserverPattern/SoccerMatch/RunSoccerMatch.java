package ObserverPattern.SoccerMatch;

public class RunSoccerMatch
{
  public static void main(String[] args)
  {
    SoccerMatch sm= new SoccerMatch();
    OldBoysFan obf= new OldBoysFan(sm);
    Refree refree= new Refree(sm);
    sm.startMatch();
  }
}
