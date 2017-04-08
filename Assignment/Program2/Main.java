import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
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
   private static JobList jobList = new JobList(); 
   
    /**
    * the resolved jobs list
    */ 
   private static JobList resolvedList = new JobList();
   
   /**
    * Call Center Consultant Window
    */ 
   private static JFrame frame = new JFrame("OM");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       jobList.loadOpen(OPEN_FILE);
       resolvedList.loadClosed(CLOSED_FILE);
      layoutComponents();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //set window size
      frame.pack();
      // Get the screen size
      GraphicsConfiguration gc = frame.getGraphicsConfiguration();
      Rectangle bounds = gc.getBounds();
      //get window size
      Rectangle r = frame.getBounds();
      int h = r.height;
      int w = r.width;
      //sets screen position
      frame.setLocation((int) ((bounds.width /2) - (h / 2)),
                        (int) ((bounds.height / 2) - (w / 2))); 
      frame.setVisible(true);
    }
    private static void layoutComponents() {
    //instatiate the boxes
      JPanel box0 = new JPanel();
      //set box orientation 
      box0.setLayout(new BoxLayout(box0, BoxLayout.Y_AXIS));
      //add boxes to window
      frame.add(box0);
      //set box content orientation 
      box0.setAlignmentX(Component.LEFT_ALIGNMENT);
      //set padding
      box0.setBorder(new EmptyBorder(5, 5, 5, 5));
      //add components
      JLabel total = new JLabel("Total number of Jobs: " + jobList.getTotal());
      JLabel pending = new JLabel("Number of Pending jobs: " + jobList.getSize());
      JLabel cccResolved = new JLabel("Jobs resolved by CCC: " + resolvedList.getCcc());
      JLabel tsoResolved = new JLabel("Jobs resolved by TSO: " + resolvedList.getTso());
      JLabel cccPercentage = new JLabel("Percentage of jobs resolved by CCC: " + resolvedList.getCccPercentt() + "%");
      JLabel tsoPercentage = new JLabel("Percentage of jobs resolved by TSO: " + resolvedList.getTsoPercent() + "%");
      JLabel longestTime = new JLabel("Longest job resolve time: " + resolvedList.getLongest());
      JLabel averageTime = new JLabel("average job resolve time: " + resolvedList.getAverage());
      box0.add(total);
      box0.add(pending);
      box0.add(cccResolved);
      box0.add(tsoResolved);
      box0.add(cccPercentage);
      box0.add(tsoPercentage);
      box0.add(longestTime);
      box0.add(averageTime);
   }
}
