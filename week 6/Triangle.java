/*
** file:   Shape.java
** author: Andrew Rock
** purpose: This class represents a shape. Every shape has an area.
*/

public abstract class Triangle extends Shape{

	private double x = 0;
	private double y = 0;
	private double w = 0;
	private double h = 0;
	
	public double tri(double nx, double ny){
		this.x = nx;
		this.y = ny;
	}
   public abstract double area(){
		return double (w*h);
	}
	public String toString(){
		//return s.format(%s, "Area of  triangle (base = ", x, "height = ", y ") = ", area());
	}

