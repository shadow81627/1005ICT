/*
** file:   Shape.java
** author: Andrew Rock
** purpose: This class represents a shape. Every shape has an area.
*/

public abstract class Rectangle extends Shape{

	private double x = 0;
	private double y = 0;
	private double w = 0;
	private double h = 0;
	
	public double circle(double nx){
		this.x = nx;
		y = (2*Math.PI);
	}

   // area() returns the area of this shape.
   public abstract double area(){
		return double (w*h);
	}
	public String toString(){
		//return s.format(%s, "Area of  circle (radius = ", x, ") = ", area());
	}
}
