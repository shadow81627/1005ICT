
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import static java.lang.Math.*;

/**
 * Reads in a file of towers x and y coordinates a file of readings with x y 
 * coordinates and signal strength then draws the towers and signals into a 500
 * by 500 area with a  black background.
 * @author s5014219 Damien Robinson
 */
public final class PointsList extends JPanel{
   
    /**
    * A set that contains the positions of towers.
    */
   private static final Set<Point> towers = new HashSet<>();
   
    /**
    * A set that contains the positions of signals.
    */
   private static final Set<Point> signals = new HashSet<>();
 
    public PointsList(){
        /**
        * Loads the towers.txt.
        */
        try {
            Scanner in = new Scanner(new File("towers.txt"));
            while (in.hasNextDouble()) {
                double x = in.nextDouble();
                double y = in.nextDouble();
               towers.add(new Point(x, y));
            }
            in.close();
        } catch (Exception e) {
           // skip (there was no data file)
        }
        
        /**
         * Loads the readings.txt.
         */  
        try {
             Scanner in = new Scanner(new File("readings.txt"));
             while (in.hasNextDouble()) {
                 double x = in.nextDouble();
                 double y = in.nextDouble();
                 double d = in.nextDouble();
                 //check to see which tower is closest
                 double a = 0;
                 for (Point i : towers) {
                   double tx = abs(x - i.getX());
                   double ty = abs(y - i.getY());
                   double th = (pow(tx, 2)) + (pow(ty, 2));
                   th = sqrt(th);
                   if((th < a) || (a == 0)){
                       a = th;
                   }else {
                       //a is bigger do nothing
                   }
                 }
                 double dB = ((40 * log10(1.0/a)) - 9.0);
                 if(dB > d){
                    signals.add(new Point(x, y, d, false)); 
                 }else {
                     signals.add(new Point(x, y, d, true));
                 }
                 
             }
             in.close();
        } catch (Exception e) {
           // skip (there was no data file)
        }
    }
    /**
     * Returns the dimensions of the panel.
     * @return the dimensions of the panel
     */
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
    
    /**
     * replaces the paintComponent method of JPanel
     * paints a black background with readings and towers 
     * @param g 
     */
    public void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0, 500, 500);
        for (Point i : signals){
           int x = (int) i.getX() /10;
           int y = (int) i.getY() /10;
           Color c = i.getC();
           Graphics2D g2 = (Graphics2D) g.create();
           g2.setColor(c);
           g2.fillOval(x - 1, y - 1, 3, 3);
        }
        for (Point i : towers){
           int x = (int) i.getX() /10;
           int y = (int) i.getY() /10;
           Color c = i.getC();
           Graphics2D g2 = (Graphics2D) g.create();
           g2.setColor(c);
           g2.fillOval(x - 8, y - 8, 9, 9);
        }
    }
}
