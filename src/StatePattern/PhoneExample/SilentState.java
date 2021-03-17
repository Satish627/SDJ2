package StatePattern.PhoneExample;

public class SilentState implements PhoneState
{
  @Override public void onReceiveMessage(String txt, Phone phone)
  {
    phone.lightUpScreen();
    System.out.println(txt);
  }

  @Override public void onReceiveCall(Phone phone)
  {
    phone.lightUpScreen();
  }

  @Override public void onVolumeUp(Phone phone)
  {
    phone.setState( new SoundState());
  }

  @Override public void onVolumeDown(Phone phone)
  {
    phone.turnVolumeDown();
  }
}
