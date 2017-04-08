import java.awt.*;
import javax.swing.*;

/**
 * A point contains the x y coordinates signal strength and colour 
 * of a tower or signal
 * @author s5014219 Damien Robinson
 */
public class Point{
    
    /**
     * x coordinate for the point 
     */
    private final double x;
    
    /**
     * y coordinate for the point
     */
    private final double y;
    
    /**
     * signal strength of a point in decibels 
     */
    private final double d;
    
     /**
     * signal strength of a point in decibels 
     */
    private final Color c;
    
    /**
     * creates a new point for a signal with
     * @param x  coordinate
     * @param y coordinate
     * @param d decibels
     * @param s quality of signal true is good false is bad
     */
    public Point(double x, double y, double d, boolean s) {
        this.x = x;
        this.y = y;
        this.d = d;
        if(s){
           this.c = Color.green;
        }else {
            this.c = Color.RED;
        }
    }

    /**
     * creates a new point for a tower with
     * @param x  coordinate
     * @param y coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.d = 0;
        this.c = Color.blue;
    }
    
    /**
     * @return the d
     */
    public double getD() {
        return d;
    }

    /**
     * @return the c
     */
    public Color getC() {
        return c;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }
}
