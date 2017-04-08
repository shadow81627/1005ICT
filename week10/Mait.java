import java.util.*;
import java.io.*;

public class Mait {

  public static ArrayList<ArrayList> table = new ArrayList<ArrayList>();

  public static void main(String[] args) throws FileNotFoundException {
    
    Scanner sc = new Scanner(new File ("sightings.csv"));  
    
    while(sc.hasNextLine()){
        String s = sc.nextLine();
        String[] line = s.split("\t");
        ArrayList row = new ArrayList();
        
        
        for (int i = 0; i < line.length; i++){
            row.add(line[i]);
        }
        
        table.add(row);
        
    }
    
    for (int i = 0; i < table.get(0).size(); i++){
        for (int j = 0; j < table.size(); j++){
                System.out.print(table.get(j).get(i));
                System.out.print("\t");
            }
        }
        
        System.out.println("");
        
     }
     
  }