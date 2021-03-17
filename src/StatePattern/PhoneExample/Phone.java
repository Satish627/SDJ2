package StatePattern.PhoneExample;


public class Phone
{
  private PhoneState currentState = new SilentState();
  private int currentVolume;

  public Phone() { }

  public void receiveMessage(String txt)
  {
    currentState.onReceiveMessage(txt, this);
  }

  public void receiveCall()
  {
    currentState.onReceiveCall(this);
  }

  public void volumeButtonUp()
  {
    currentState.onVolumeUp(this);
  }

  public void volumeButtonDown()
  {
    currentState.onVolumeDown(this);
  }

  public void goToSilent()
  {
    currentState = new SilentState();
  }

  public void goToSound()
  {
    currentState = new SoundState();
  }

  public void goToVibrate()
  {
    currentState = new VibrateState();
  }

  protected void turnVolumeUp()
  {
    currentVolume++;
  }

  protected void turnVolumeDown()
  {
    currentVolume--;
  }

  protected void playRingTone()
  {
    System.out.println(" Pew pew ");
  }

  protected void vibrate()
  {
    System.out.println(" Girr girr ");
  }

  protected void lightUpScreen()
  {
    System.out.println(" Screen brighting up ");
  }

  protected void beepBeep()
  {
    System.out.println(" Beeppp beeep ");
  }

  protected int getVolume()
  {
    return currentVolume;
  }

  protected void setState(PhoneState state)
  {
    state = currentState;
  }
}
