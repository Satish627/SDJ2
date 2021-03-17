package MultiThreading.CounterThread1;

public class CounterThread implements Runnable

{
  private static final int Count=1000;
  private Counter counter;

  public CounterThread(Counter counter){
    this.counter=counter;
  }
  @Override public void run()
  {
    for (int i= 0;i<Count;i++){
      counter.increment();
    }

  }
}
