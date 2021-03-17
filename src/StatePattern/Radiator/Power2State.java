package StatePattern.Radiator;

public class Power2State implements RadiatorState
{
  private static final int power=2;
  private Radiator radiator;

  public Power2State(Radiator radiator){
    this.radiator=radiator;
  }

  @Override public RadiatorState turnUp(Radiator radiator)
  {
    return new Power3State(radiator);
  }

  @Override public RadiatorState turnDown(Radiator radiator)
  {
    return new Power1State(radiator);
  }

  @Override public int getPower()
  {
    return power;
  }
}
