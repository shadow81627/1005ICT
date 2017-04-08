/*
** File: lesserCompare
** Author: Damien Robinson 
** Purpose: To compare a list of words from input to see which word has the smallest value
*/

//import java.util.*;

public class LesserString {

	public String Compare(String a, String b) {
		int i = 0;
		String e = ("Equal value");
		i = a.compareToIgnoreCase(b);
		if(i < 0){
			 return b;
		}else if(i > 0) {
			return a;
		}else {
			return e;
		}
	}
}