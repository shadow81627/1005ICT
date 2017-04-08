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
	
	public double square(double nx){
		this.x = nx;
		y = x;
	} 
   // area() returns the area of this shape.
   public abstract double area(){
		return double(w*h);
	}

	public String toString(){
		//return s.format(%s, "Area of  square (base = ", x, "height = ", y ") = ", area());
	}

}
