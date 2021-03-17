package Interfaces.ShapeExample;

import java.util.ArrayList;

public class RunShape
{
  public static void main(String[] args)
  {
    Shape c1= new Circle(2);
    Circle c2= new Circle(3);
    Shape s1= (Shape)c2;
    Shape r1= new RightAngledTriangle(4,5);
    r1= c2;

//    System.out.println(r1.getName());
    ArrayList<Shape> shapes= new ArrayList<>();
    shapes.add(new Circle(2));
    shapes.add(new Square(4));

    for (Shape shape : shapes)
    System.out.println(shape.getName());
  }
}
