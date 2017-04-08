
import java.awt.*;
import javax.swing.*;

/**
 * brings up a window with the towers and signals plotted inside of it.
 * @author s5014219 Damien Robinson
 */
public class Main {

    /**
    * Call Center Consultant Window
    */ 
   private static JFrame frame = new JFrame("Coverage Display");
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(new PointsList());
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
}
