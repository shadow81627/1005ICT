/*
** File: SnailRanch
** Author: Damien Robinson 
** Purpose: To stimulate snails orgies 
*/

import java.util.*;
import java.io.*;

public class Main {
	int REPRODUCTION_RATE = 100,
		BASE_POPULATION = 200,
		HERON = 63,
		yeild = 0;

	 int population = 0;
		
	public static void main(String[] args) throws FileNotFoundExeption { 
		Scanner sc = new Scanner(new File (args[0]));

		while(sc.isNextLine()){
			if(sc.isNextWord().equals("stock")){
				SnailRanch(sc.isNextInt);
				System.out.println("stock" + population());
			}else if(sc.isNextWord().equals("breed")){
				breed();
				System.out.println("breed" + population());
			}else if(sc.isNextWord().equals("harvest")){
				harvest();
				System.out.println("harvest" + population());
			}else if(sc.next().equals("heron")){
				heron(sc.nextInt);
				System.out.println("heron" + population());
			}
			System.out.println("yield = " yeild);
		}
	}

	public int getPopulation(){
		return population;
	}
	public void breed(){
		population = population + ((population * 0.5) * REPRODUCTION_RATE);
	}
	public void harvest(){
		while(population > 200){
			population = population - 1;
			yeild = yeild + 1;
	}
	public void heron(int y){
		population = population -(y * HERON);
	}
}