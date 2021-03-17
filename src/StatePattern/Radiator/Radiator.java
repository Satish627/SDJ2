package StatePattern.Radiator;

import java.util.Timer;

public class Radiator
{
  public Timer time;
  private RadiatorState currentState;

  public Radiator()

  {
    currentState = new OffState(this);
    time= new Timer();

  }

  public void turnUp()
  {
    setPowerState(currentState.turnUp(this));
  }

  public void turnDown()
  {
    setPowerState(currentState.turnDown(this));
  }

  public void getPower()
  {
    currentState.getPower();
  }

  public void setPowerState(RadiatorState state)
  {
    currentState = state;
  }
}
