package Interfaces.ShapeExample;

public class Square implements Polygon
{
  private double length;

  public Square(double length)
  {
    this.length = length;
  }

  @Override public String getName()
  {
    return "Square";
  }

  @Override public int getNumberOfAngles()
  {
    return 4;
  }

  @Override public double getArea()
  {
    return length*length;
  }

  @Override public double getCircumference()
  {
    return 4*length;
  }
}
