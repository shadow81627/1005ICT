/*
** file:   Shape.java
** author: Andrew Rock
** purpose: This class represents a shape. Every shape has an area.
*/

public abstract class Rectangle {

	private double x = 0;
	private double y = 0;
	private double w = 0;
	private double h = 0;
	
	public double rect(double nx, double ny, double nw, double nh){
		this.x = nx;
		this.y = ny;
		this.w = nw;
		this.h = nh;
	}
	/*public double tri(double nx, double ny){
		this.x = nx;
		this.y = ny;
	}
	public double circle(double nx){
		this.x = nx;
		y = (2*Math.PI);
	}
	public double square(double nx){
		this.x = nx;
		y = x;
	} */
   // area() returns the area of this shape.
   public abstract double area();
		return (w*h);
	
	public String toString(){
		printf(%s, "Area of  rectangle (base = ", x, "height = ", y ") = ", area(););
	}
}
