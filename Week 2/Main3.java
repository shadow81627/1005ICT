/*
** File: TriArea
** Author: Damien Robinson 
** Purpose: To use 3 numeric inputs for sides a, b and c of a triangle to calculate area
*/
public class Main2 {

   public static void main(String[] args) {
	  double base = Double.parseDouble(args[0]),
			 tangent = Double.parseDouble(args[2]),
             height = Double.parseDouble(args[1]);
      System.out.println("Area = " + TriArea2.area(base, height, tangent));
   }
   
}