package StatePattern.Radiator;

public class OffState implements RadiatorState
{
  private static final int power=0;
  private Radiator radiator;

  public OffState(Radiator radiator){
    this.radiator=radiator;
  }

  @Override public RadiatorState turnUp(Radiator radiator)
  {
    return new Power1State(radiator);
  }

  @Override public RadiatorState turnDown(Radiator radiator)
  {
    return this;
  }

  @Override public int getPower()
  {
    return power;
  }
}
