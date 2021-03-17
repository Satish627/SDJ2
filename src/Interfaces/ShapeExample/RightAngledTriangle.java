package Interfaces.ShapeExample;

public class RightAngledTriangle implements Polygon
{
  private double height,length;

  public RightAngledTriangle(double height, double length)
  {
    this.height = height;
    this.length = length;
  }

  @Override public String getName()
  {
    return "Triangle";
  }

  @Override public int getNumberOfAngles()
  {
    return 3;
  }

  @Override public double getArea()
  {
    return 0.5*length*height;
  }

  @Override public double getCircumference()
  {
    return length+height+ Math.sqrt(length*length+height*height);
  }
}
