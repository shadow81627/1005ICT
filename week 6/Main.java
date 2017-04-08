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
					Shape.rect(x, y, w, h);
					System.out.println("area = " + Shape.area);
				}else if(sc.isNextWord().equals("square")){
					double x = sc.nextDouble();
					Shape.rect(x);
					System.out.println("area = " + Shape.area);
				}else if(sc.isNextWord().equals("circle")){
					double x = sc.nextDouble();
					Shape.rect(x);
					System.out.println("area = " + Shape.area);
					}else if(sc.isNextWord().equals("triangle")){
					double x = sc.nextDouble();
					double y = sc.nextDouble();
					Shape.rect(x);
					System.out.println("area = " + Shape.area);
				}else if(sc.isNextWord().equals("quit")){
					quit = false;
				}else{
				}
			}
		}
	}
}
