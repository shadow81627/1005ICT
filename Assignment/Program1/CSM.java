/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

/**
 *
 * @author s5014219 Damien Robinson
 */
public class CSM {
    
    /**
    * Call Center Consultant Window
    */ 
   private static JFrame frame = new JFrame("CSM");
   
     public CSM() {
  
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
      frame.setLocation((int) (((bounds.width /6)*5) - (h / 2)),
                        (int) (((bounds.height / 2)) - (w / 2))); 
      frame.setVisible(true);
    }
            
   /**
    * output text area
    */ 
   private static JList<String> list = new JList(Main.jobList.getJobs());

   /**
    * buttons for 
    */ 
   private static JButton
      advanceBtn = new JButton("Advance"),
      saveBtn = new JButton("Save");
   
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
      JLabel descriptionLbl = new JLabel("Jobs:");
      box1.add(descriptionLbl);
      descriptionLbl.setAlignmentX(Component.LEFT_ALIGNMENT);
      JScrollPane scroller = new JScrollPane(list);
      box1.add(scroller);
      scroller.setAlignmentX(Component.LEFT_ALIGNMENT);
      box2.add(advanceBtn);
      box2.add(saveBtn);
   }
   
   /**
    * Adds event listeners to the
    * components and the frame.
    */ 
   private static void addListeners() {
      advanceBtn.addActionListener(
         new ActionListener() {
            public void actionPerformed(
               ActionEvent e) {
                
            }
         });
      saveBtn.addActionListener(
         new ActionListener() {
            public void actionPerformed(
               ActionEvent e) {
                Main.jobList.save(Main.OPEN_FILE);
            }
         });
        list.addListSelectionListener(null);
   }
}
