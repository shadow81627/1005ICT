/*
** File: RectangleTool
** Author: Damien Robinson 
** Purpose: To compare a list of words from input to see which word has the smallest value
*/

import java.util.*;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean quit = true;
		double x = 0;
		double y = 0;
		double w = 0;
		double h = 0;
				
		while(quit){
			System.out.println("?");
			while(sc.nextLine()){
				if(sc.isNextWord() == "area"){
					double x = sc.nextDouble();
					double y = sc.nextDouble();
					double w = sc.nextDouble();
					double h = sc.nextDouble();
					Rect.rect(x, y, w, h);
					System.out.println("area = " + Rect.area);
				}else if(sc.isNextWord().equals("perimeter")){
					double x = sc.nextDouble();
					double y = sc.nextDouble();
					double w = sc.nextDouble();
					double h = sc.nextDouble();
					Rect.rect(x, y, w, h);
					perimeter(x, y, w, h);
				}else if(sc.isNextWord().equals("quit")){
					quit = false;
				}else if(sc.isNextWord().equals("rect")){
					rect(x, y, w, h);
				}else{
				}
			}
		}
	}
}
public class Rect{
	private double = x;
	private double = y;
	private double = w;
	private double = h;
	
	public double rect(double nx, double ny, double nw, double nh){
		this.x = nx;
		this.y = ny;
		this.w = nw;
		this.h = nh;
		//System.out.println("rectangle = " + x + y + w + h);
	}
	public void area(){
		//
		return (w*h);
	}
	public void perimeter(){
		//System.out.println("area = " + ((w+h)*2));
		return ((w+h)*2));
	}
	public String toString(){
		
	}
}
