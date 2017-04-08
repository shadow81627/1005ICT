
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

/**
 *
 * @author s5014219 Damien Robinson
 */
public class TSO {
   
    /**
    * Call Center Consultant Window
    */ 
   private static JFrame frame = new JFrame("TSO");
   
     public TSO() {
      layoutComponents();
      addListeners();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Get the screen size
      GraphicsConfiguration gc = frame.getGraphicsConfiguration();
      Rectangle bounds = gc.getBounds();
      //set window size
      frame.pack();
      //get window size
      Rectangle r = frame.getBounds();
      int h = r.height;
      int w = r.width;
      //sets screen position
      frame.setLocation((int) (((bounds.width /6)*3) - (h / 2)),
                        (int) (((bounds.height / 2)) - (w / 2))); 
      frame.setVisible(true);
    }
         
   /**
    * output text area
    */ 
   private static JTextArea description = new JTextArea(10, 25);

   /**
    * buttons for 
    */ 
   private static JButton resolveBtn = new JButton("Resolve");
   
   /**
    * Lays out the components.
    */ 
   private static void layoutComponents() {
    //instatiate the boxes
      JPanel box0 = new JPanel(),
             box1 = new JPanel(),
             box2 = new JPanel();
      //set box orientation 
      box0.setLayout(new BoxLayout(box0, BoxLayout.Y_AXIS));
      box1.setLayout(new BoxLayout(box1, BoxLayout.Y_AXIS));
      box2.setLayout(new BoxLayout(box2, BoxLayout.X_AXIS));
      //add boxes to window
      frame.add(box0);
      box0.add(box1);
      box0.add(box2);
      //set box content orientation 
      box1.setAlignmentX(Component.CENTER_ALIGNMENT);
      box2.setAlignmentX(Component.CENTER_ALIGNMENT);
      //set padding
      box1.setBorder(new EmptyBorder(5, 5, 5, 5));
      box2.setBorder(new EmptyBorder(5, 5, 5, 5));
      //add components
      JLabel descriptionLbl = new JLabel("Description:");
      box1.add(descriptionLbl);
      descriptionLbl.setAlignmentX(Component.LEFT_ALIGNMENT);
      description.setText(Main.jobList.topJob());
      description.setEditable(false);
      JScrollPane scroller = new JScrollPane(description);
      box1.add(scroller);
      scroller.setAlignmentX(Component.LEFT_ALIGNMENT);
      box2.add(resolveBtn);
   }
   
   /**
    * Adds event listeners to the
    * components and the frame.
    */ 
   private static void addListeners() {
      resolveBtn.addActionListener(
         new ActionListener() {
            public void actionPerformed(
               ActionEvent e) {
               Main.jobList.resolve(Main.CLOSED_FILE, description.getText());
               description.setText(Main.jobList.topJob());
            }
         });
   }
}
