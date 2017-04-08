/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author s5014219
 */
/*
** file:    SafeDNS.java
** purpose: This interface defines the services required of
**          to block banned sites.
*/

public interface safeDNS {
   
   // blacklist(ipa) adds thus IPA to a blacklist.
   // A  blacklisted IPA will not be returned by the
   // lookUp method.
   public void blacklist(String ipa);
   
}