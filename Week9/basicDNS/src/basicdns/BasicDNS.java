/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author s5014219
 */

    
public interface BasicDNS {
   
   // update(domain, ipa) adds (or replaces)
   // the IPA for this domain to the DNS database.
   public void update(String domain, String ipa);
   
   // lookUp(ipa, domain) returns the IPA associated
   // with this domain, or null if it is not found in
   // the database (or not returnable for legal reasons,
   // such as blacklisting). 
   // The first argument, ipa, is the IPA from which this
   // request originated.
   public String lookUp(String ipa, String domain);
}