/*
** File: lesserCompare
** Author: Damien Robinson 
** Purpose: To compare a list of words from input to see which word has the smallest value
*/

//import java.util.*;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		i = args[0].compareToIgnoreCase(args[1]);
		if(i < 0){
			 System.out.println(args[1]);
		}else if(i > 0) {
			System.out.println(args[0]);
		}else {
		}
	}
}

/*System.out.println("running");
		Scanner sc = new Scanner(System.in);
		String w = "";
		 while (sc.hasNext()) {
		int i = w.compareToIgnoreCase(sc.next());
		if(i < 0){
			w = sc.next();
		}else if(i > 0){
		}else{
			w = sc.next();
		}
		System.out.println(w);
	  }*/
		