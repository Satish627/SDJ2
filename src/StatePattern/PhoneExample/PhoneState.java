package StatePattern.PhoneExample;

public interface PhoneState
{
  public void onReceiveMessage(String txt,Phone phone);
  public void onReceiveCall(Phone phone);
  public void onVolumeUp(Phone phone);
  public void onVolumeDown(Phone phone);

}
