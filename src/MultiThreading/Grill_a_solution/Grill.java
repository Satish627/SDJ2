package MultiThreading.Grill_a_solution;

public class Grill
{
  private int maxBurgers;
  private int burgersInStock=0;
  private int burgersInProduction=0;

  public Grill(int maxBurgers)
  {
    this.maxBurgers = maxBurgers;
  }
  public synchronized void buyBurgers(int noBurgers){
    while (noBurgers>burgersInStock){
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
      }
      burgersInStock-=noBurgers;
      notifyAll();
    }
  }
  public synchronized void startProducing(){
    while (burgersInStock+burgersInProduction>=maxBurgers)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
      }
    }
    burgersInProduction++;
  }
  public synchronized void burgerCompleted(){
    ++burgersInStock;
    burgersInProduction--;

    notifyAll();
  }
}
