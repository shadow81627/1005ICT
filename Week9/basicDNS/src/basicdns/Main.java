

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
    
    //public static Map<String, String> d = new HashMap<>();
    public static boolean quit = false;
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundExeption {
        DNS d = new DNS();
        Scanner sc = new Scanner (System.in);
        while(!quit){
            System.out.println("function?");
            String function = sc.next();
            String domain ="";
            String ipa ="";
            if(function.equals("lookUp")){
                System.out.println("parameters");
                domain = sc.next();
               // ipa = sc.next();
                String out;
                out = d.lookUp(ipa, domain);
                System.out.println("IPA" + " " + out);
            }else if(function.equals("update")){
                domain = sc.next();
                ipa = sc.next();
                 d.update(domain, ipa);
           }else if(function.equals("quit")){
                System.exit(0);
           }else if(function.equals("blacklist")){
               ipa = sc.next();
               d.blacklist(ipa);
           
            }else{
                //skip
            }
        }
    }
}