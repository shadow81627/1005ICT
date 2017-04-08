/*
** File: Main.java
** Author: Damien Robinson
** Purpose: draw a pie chart 
*/
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Main {
	public static final int	FRAME_WIDTH = 600,
							FRAME_HEIGHT = 800;
														
	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File (args[0]));
		JFrame f = new JFrame("PieChart");
		f.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new PieChart(sc));
		f.setVisible(true);
		
	}
}