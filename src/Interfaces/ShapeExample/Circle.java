package Interfaces.ShapeExample;

public class Circle implements Shape
{
  private double radius;

  public Circle(double radius)
  {
    this.radius = radius;
  }

  @Override public String getName()
  {
    return "Circle";
  }



  @Override public double getArea()
  {
    return radius*radius*Math.PI;
  }

  @Override public double getCircumference()
  {
    return 2*Math.PI*radius;
  }
}
