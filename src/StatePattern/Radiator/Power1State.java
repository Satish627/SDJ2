package StatePattern.Radiator;

public class Power1State implements RadiatorState
{
  private static final int power = 1;
  private Radiator radiator;

  public Power1State(Radiator radiator){
    this.radiator= radiator;
  }

  @Override public RadiatorState turnUp(Radiator radiator)
  {
    return new Power2State(radiator);
  }

  @Override public RadiatorState turnDown(Radiator radiator)
  {
    return new OffState(radiator);
  }

  @Override public int getPower()
  {
    return power;
  }
}
