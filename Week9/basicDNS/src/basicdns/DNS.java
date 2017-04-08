/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

public class DNS implements BasicDNS, safeDNS {

    Map<String, String> dataBase = new HashMap<String, String>();
    Set<String> blackList = new HashSet<String>();
    
   
    /**
     * looks through database for the domain
     */
    public void update(String domain, String ipa){
        dataBase.put(domain, ipa);
    }
   
    public String lookUp(String ipa, String domain){
        String a = dataBase.get(domain);
        
        if(a == null || blackList.contains(a)){
               return null;   
        }else {
             return a;
        }
    }
    public void blacklist(String ipa){
        blackList.add(ipa);
        
    }
}   
