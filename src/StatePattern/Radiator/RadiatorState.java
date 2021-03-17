package StatePattern.Radiator;

public interface RadiatorState
{
  RadiatorState turnUp(Radiator radiator);
  RadiatorState turnDown(Radiator radiator);
   int getPower();
}
