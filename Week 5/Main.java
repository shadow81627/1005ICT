/*
** File: lesserCompare
** Author: Damien Robinson 
** Purpose: To compare a list of words from input to see which word has the smallest value
*/

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("?");
		String a = sc.nextLine();
		System.out.println("?");
		String b = sc.nextLine();
		int i = 0;
		i = a.compareToIgnoreCase(b);
		if(i < 0){
			 System.out.println("Lesser is: " + a);
		}else if(i > 0) {
			System.out.println("Lesser is: " + b);
		}else {
		}
	}
}
