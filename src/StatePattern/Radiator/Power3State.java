package StatePattern.Radiator;

public class Power3State implements RadiatorState
{
  private static final int power=3;
  private Radiator radiator;
  private int waiting_time=10000;

  public Power3State(Radiator radiator){
    this.radiator=radiator;
//    radiator.time.(waiting_time);
  }

  @Override public RadiatorState turnUp(Radiator radiator)
  {
    return null;
  }

  @Override public RadiatorState turnDown(Radiator radiator)
  {
    return null;
  }

  @Override public int getPower()
  {
    return 0;
  }
}
