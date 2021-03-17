package MultiThreading.SynchronizedCounter;

public class synchronizedCounter
{
  private  long count=20000;

  public  synchronized void incrementer(){
    ++count;
  }
//  public synchronized void decrementer(){
//    --count;
//  }
  public synchronized long getCount(){
    return count;
  }
}
