

import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s5014219
 */
public class Main {
      /**
     * @param args the command line arguments
     */
    public static ArrayList <ArrayList> table = new ArrayList<ArrayList>();
    int index = 0;
    
        public static void main(String[] args) throws FileNotFoundException {
            Scanner sc = new Scanner (new File ("sightings.csv"));
            while(sc.hasNextLine()){
                
                String s = sc.nextLine();
                String[] line = s.split("\t");
                ArrayList row = new ArrayList();


                for (int i = 0; i < line.length; i++){
                    row.add(line[i]);
                }
                /*ArrayList row = new ArrayList();
                row.add(sc.nextLine().split("/t"));
                table.add(row);
                //index = index + 1;*/

            }
                            
            for (int i = 0; i < table.get(0).size(); i = i + 1){
              for (int j = 0; j < table.size(); j = j + 1){
                  
                  System.out.print(table.get(j).get(i));
                  System.out.print("/t");
                }  
            }
    }
}