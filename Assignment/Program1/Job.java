import java.util.*;

/**
 * A job is a is an id phone number description and time for a job.
 * @author s5014219 Damien Robinson, Andrew Rock 
 */
public class Job {

   /**
    * the next available job number
    */
   private static int next_id = 1;
   
   /**
    * job id
    */
   private final int id; 
   
    /**
    * job phone number
    */
   private final int phone; 
   
    /**
    * number of lines in description
    */
   private int lines; 
   
  
   /**
    * An ArrayList that contains the lines of a jobs description.
    */
   private ArrayList<String> description = new ArrayList<>();
   
    /**
    * job time
    */
   private final long time; 

    /**
     * Makes a new Job with
     * this phone number and the next available job number.
     * @param phone this job's phone number
     * @param description this job's description
     */
    public Job(int phone, String description) {
      this.id = next_id;
      next_id++;
      this.phone = phone;
      description = description.trim();
      Scanner in = new Scanner(description);
      while(in.hasNextLine()){
          lines = lines + 1;
          this.description.add(in.nextLine());
      }
      in.close();
      this.time = new Date().getTime();
   }
    
    /**
     * Makes a new Job with this id and phone number.
     * @param id this job's id
     * @param phone this job's phone number
     * @param description this job's description
     * @param time this job's time
     * @param lines this job's number of lines
     */
    public Job(int id, int phone, int lines, String description, long time) {
      this.id = id;
      this.phone = phone;
      this.lines = lines;
      description = description.trim();
      Scanner in = new Scanner(description);
      for(int i = 0; i < lines; i = i + 1){
         this.description.add(in.nextLine()); 
      }
      in.close();
      this.time = time;
   }
   
    /**
     * Returns the next available id number.
     * @return the next available id number.
     */
    public static int getNextId() {
      return next_id;
   }
   
    /**
     * Sets the next available id number.
     * @param next_id the next id number to use
     */
    public static void setNextId(int next_id) {
      Job.next_id = next_id;
   }
   
    /**
     * Returns this job's id.
     * @return this job's id.
     */
    public int getId() {
      return id;
   }
   
    /**
     * Returns this jobs phone.
     * @return this jobs phone.
     */
    public int getPhone() {
      return phone;
   }
    
     /**
     * Returns this jobs description lines.
     * @return this jobs description lines.
     */
    public int getLines() {
      return lines;
   }
   
      /**
     * Returns this jobs description.
     * @return this jobs description.
     */
    public String getDescription() {
        StringBuilder d = new StringBuilder();
        for(int i = 0; i < description.size(); i = i + 1){
           d.append(description.get(i)).append(System.lineSeparator());
       }
       return d.toString().trim();
   }
    
     /**
     * Returns this jobs time.
     * @return this jobs time.
     */
    public long getTime() {
      return time;
   }
    /**
     * Returns a textual representation of this Job.
     * @return a textual representation of this Job.
     */
    public String toString() {
      return id + System.lineSeparator() + phone + System.lineSeparator() + 
              lines + System.lineSeparator() + getDescription() 
              + System.lineSeparator() + time;
   }
}