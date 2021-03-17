package StatePattern.PhoneExample;

public class VibrateState implements PhoneState
{
  @Override public void onReceiveMessage(String txt, Phone phone)
  {
  phone.vibrate();
    System.out.println(txt);
  }

  @Override public void onReceiveCall(Phone phone)
  {
    phone.vibrate();
  }

  @Override public void onVolumeUp(Phone phone)
  {
    phone.turnVolumeUp();
  }

  @Override public void onVolumeDown(Phone phone)
  {
    phone.turnVolumeDown();
  }
}
