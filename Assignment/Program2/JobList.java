import java.util.*;
import java.io.*;

/**
 * A database for all the jobs.
 * @author s5014219 Damien Robinson, Andrew Rock
 */
public class JobList {

   /**
    * A deque contains the current jobs.
    */
   private Deque<Job> jobs = new ArrayDeque<>();
   
   /**
    * the number of jobs resolved by a CCC.
    */
   private int ccc;
   
   /**
    * the number of jobs resolved by a TSO.
    */
   private int tso;
   
   /**
    * the average time to resolve a job.
    */
   private long average;
   
   /**
    * the longest time to resolve a job.
    */
   private long longest;

    /**
     * Loads the open jobs.
     * @param fileName
     */
    public void loadOpen(String fileName) {
        try {
         Scanner in = new Scanner(new File(fileName));
         Job.setNextId(in.nextInt());
         while(in.hasNextInt()) {
             int id = in.nextInt();
             int phone = in.nextInt();
             int lines = in.nextInt();
             StringBuilder description = new StringBuilder();
             for(int i = 0; i < lines; i = i + 1){
                description.append(in.nextLine()).append(System.lineSeparator());
             }
             long time = in.nextLong();
             jobs.addLast(new Job(id, phone, lines, description.toString(), time));
         }
         in.close();
      } catch (Exception e) {
         // skip (there was no data file)
      }
   }
    
    /**
     * Loads the closed jobs.
     * @param fileName
     */
    public void loadClosed(String fileName) {
        try {
         Scanner in = new Scanner(new File(fileName));
         while(in.hasNextInt()) {
             int id = in.nextInt();
             int phone = in.nextInt();
             int lines = in.nextInt();
             StringBuilder description = new StringBuilder();
             for(int i = 0; i < lines; i = i + 1){
                description.append(in.nextLine()).append(System.lineSeparator());
             }
             long time = in.nextLong();
             long resolved = in.nextLong();
             average = (time - resolved) / jobs.size();
             if((time - resolved) > longest){
                 longest = time - resolved;
             } else{
                 //longest is bigger do nothing
             }
             if((time - resolved) == 0){
                 ccc++;
             }else{
                 tso++;
             }            
             jobs.addLast(new Job(id, phone, lines, description.toString(), time, resolved));
         }
         in.close();
      } catch (Exception e) {
         // skip (there was no data file)
      }
   }
    /**
     * Returns the all of the current jobs as text.
     * @return the all of the current jobs as text.
     */
    public String toString() {
      StringBuilder b = new StringBuilder();
      for (Job e : jobs) {
         b.append(e).append(System.lineSeparator());
      }
      return b.toString();
   }
    
   /**
     * Returns the number of jobs in the collection.
     * @return the number of jobs in the collection.
     */
    public int getSize() {
      return jobs.size();
   }
    
    /**
     * Returns the number of jobs in the collection.
     * @return the number of jobs in the collection.
     */
    public int getTotal() {
      return (Job.getNextId() - 1);
   }

    /**
     * @return the ccc
     */
    public int getCcc() {
        return ccc;
    }

    /**
     * @return the tso
     */
    public int getTso() {
        return tso;
    }

    /**
     * @return the average
     */
    public long getAverage() {
        return average;
    }

    /**
     * @return the longest time to resolve a job
     */
    public long getLongest() {
        return longest;
    }
    
      /**
     * @return the longest time to resolve a job
     */
    public int getTsoPercent() {
        if(!jobs.isEmpty()){
            return tso / getSize();
        }else {
            return 0;
        }
    }
    
      /**
     * @return the longest time to resolve a job
     */
    public int getCccPercentt() {
        if(!jobs.isEmpty()){
            return ccc / getSize();
        }else {
            return 0;
        }
    }
}