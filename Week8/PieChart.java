/*
** File: Main.java
** Author: Damien Robinson
** Purpose: draw a pie chart 
*/

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class PieChart extends JComponent{
	private static String[] name = new String[10];
	private static Color[] color = {Color.blue, Color.red, Color.green, Color.yellow, Color.magenta, Color.gray, Color.pink, Color.cyan, Color.black, Color.orange};
	private static int number = 0;
	private static Double[] value = new Double[10];
	//private static double[10] percentage;
		
	
	public void paintComponent(Graphics g){
		for(int i = 0; i < number; i = i + 1){
			Graphics2D g2 = (Graphics2D ) g.create();
			g2.setColor(color[i]);
			double curValue = 0;
			int startAngle = (int)(curValue / number * 360);
			int arcAngle = (int)(value[i] / number * 360);
			g2.fillArc(0, 0, (FRAME_WIDTH/2), (FRAME_HEIGHT/2), startAngle, arcAngle);
			curValue = curValue + value[i];
			g2.fillRect((FRAME_WIDTH/2), (FRAME_HEIGHT/2)* (i * 10), 20, 20);
			drawString(name[i], 20, 20 ,20);
		}
	}
	public void percentage(int value[]){
		for (int i =0; i < value.lenght; i = i + i){
		this.value[i] = (value[i]/number);
		}
	}
	public PieChart(Scanner sc){
		number = 0;
		while(sc.hasNextLine){
			sc.isNextWord = name[number];
			sc.isNextInt = value[number];
			number = number + 1;
			
			
		}
	
	}
}