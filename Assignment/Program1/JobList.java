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
     * Loads the jobs left from the previous session.
     * @param fileName
     */
    public void load(String fileName) {
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
     * Saves the jobs left for the next session.
     * @param fileName
     */
    public void save(String fileName) {
      try {
         PrintStream out = new PrintStream(fileName);
         out.println(Job.getNextId());
         while (!jobs.isEmpty()) {
            Job job = jobs.peekFirst();
            out.println(job.getId());
            out.println(job.getPhone());
            out.println(job.getLines());
            out.println(job.getDescription());
            out.println(job.getTime());
            jobs.removeFirst();
         }
         out.close();
      } catch (Exception e) {
         System.err.println("Could not save " + fileName);
         System.err.println(e);
      }
   }

    /**
     * creates a new job.
     * @param phone the phone number of this job
     * @param description the description of the job
     */
    public void send(int phone, String description) {
     description = description.trim();
         Job job = new Job(phone, description);
         jobs.addLast(job);
   }
    
    /**
     * advances a job to the front of the deque.
     * @param job the job to be advanced
     */
    public void advance(Job job) {
        jobs.remove(job);
        jobs.addFirst(job);
   }

    /**
     * removes the newest job if there is one.
     * @param phone
     * @param description
     * @param fileName
     */
    public void resolve(int phone, String description, String fileName) {
     description = description.trim();
     Job job = new Job(phone, description);
      try {
         PrintStream resolved = new PrintStream(new FileOutputStream(fileName, true));
         resolved.println(job.toString());
         resolved.println(new Date().getTime());
         resolved.close();
      } catch (Exception e) {
         System.err.println("Could not resolve job");
         System.err.println(e);
      }
   }
    
    /**
     * removes the newest job if there is one.
     * @param fileName
     */
    public void resolve(String fileName, String job) {
      try {
         PrintStream resolved = new PrintStream(new FileOutputStream(fileName, true));
         Job removeJob = null;
         Scanner in = new Scanner(job);
         while(in.hasNextInt()) {
             int id = in.nextInt();
             int phone = in.nextInt();
             int lines = in.nextInt();
             StringBuilder description = new StringBuilder();
             for(int i = 0; i < lines; i = i + 1){
                description.append(in.nextLine()).append(System.lineSeparator());
             }
             long time = in.nextLong();
             removeJob = new Job(id, phone, lines, description.toString(), time);
         }
         in.close();
         jobs.removeFirstOccurrence(removeJob);
         resolved.println(job);
         resolved.println(new Date().getTime());
         resolved.close();
      } catch (Exception e) {
         System.err.println("Could not resolve job");
         System.err.println(e);
      }
   }

     /**
     * Returns the top job of the current jobs as text.
     * @return the top job of the current jobs as text.
     */
   public String topJob(){
         if(!jobs.isEmpty()) {
            return jobs.getFirst().toString();
         }else{
            return "There are no jobs";
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
     * Returns the id numbers of jobs in the collection.
     * @return the id numbers of jobs in the collection.
     */
   public String[] getJobs() {
     String[] getJobs =  new String[jobs.size()];
     int i = 0;
     for(Job e : jobs){
         Integer  s = e.getId();
         getJobs[i] = (s.toString());
     }
     return getJobs;
   }
    
}