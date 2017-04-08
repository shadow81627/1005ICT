
/**
 * Customer Service System that manages the company's response to a customer with a technical problem.
 * @author s5014219 Damien Robinson
 */
public class Main {
    
   /**
    * open jobs data file name
    */
   protected static final String OPEN_FILE = "openjobs.txt";
   
   /**
    * closed jobs data file name
    */
   protected static final String CLOSED_FILE = "closedjobs.txt";

   /**
    * the job list
    */ 
   protected static JobList jobList = new JobList();
   
   /**
    * the job list
    */ 
   private static CCC ccc = new CCC();
   
   /**
    * the job list
    */ 
   private static TSO tso = new TSO();
   
   /**
    * the job list
    */ 
   private static CSM csm = new CSM();

    /**
     * main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      jobList.load(OPEN_FILE);
      System.out.println(jobList.topJob());
    }
}