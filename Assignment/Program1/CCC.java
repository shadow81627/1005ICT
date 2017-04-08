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
public class CCC {
    
    /**
    * Call Center Consultant Window
    */ 
   private static JFrame frame = new JFrame("CCC");
      
    public CCC () {
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
      frame.setLocation((int) ((bounds.width / 6) - (h / 2)),
                        (int) (((bounds.height / 2)) - (w / 2))); 
      frame.setVisible(true);
    }
   
   

   /**
    * input text field
    */ 
   private static JTextField phoneNumber = new JTextField(20);
         
   /**
    * output text area
    */ 
   private static JTextArea description = new JTextArea(10, 25);

   /**
    * buttons for 
    */ 
   private static JButton
      sendBtn = new JButton("Send"),
      resolveBtn = new JButton("Resolve");
   
   /**
    * Lays out the components.
    */ 
   private static void layoutComponents() {
      //instatiate the boxes
      JPanel box0 = new JPanel(),
             box1 = new JPanel(),
             box2 = new JPanel(),
             box3 = new JPanel();
      //set box orientation 
      box0.setLayout(new BoxLayout(box0, BoxLayout.Y_AXIS));
      box1.setLayout(new BoxLayout(box1, BoxLayout.X_AXIS));
      box2.setLayout(new BoxLayout(box2, BoxLayout.Y_AXIS));
      box3.setLayout(new BoxLayout(box3, BoxLayout.X_AXIS));
      //add boxes to window
      frame.add(box0);
      box0.add(box1);
      box0.add(box2);
      box0.add(box3);
      //set box content orientation 
      box1.setAlignmentX(Component.CENTER_ALIGNMENT);
      box2.setAlignmentX(Component.CENTER_ALIGNMENT);
      box3.setAlignmentX(Component.CENTER_ALIGNMENT);
      //set padding
      box1.setBorder(new EmptyBorder(5, 5, 5, 5));
      box2.setBorder(new EmptyBorder(5, 5, 5, 5));
      box3.setBorder(new EmptyBorder(5, 5, 5, 5));
      //add components
      box1.add(new JLabel("Phone Number:"));
      box1.add(phoneNumber);
      JLabel descriptionLbl = new JLabel("Description:");
      box2.add(descriptionLbl);
      descriptionLbl.setAlignmentX(Component.LEFT_ALIGNMENT);
      description.setEditable(true);
      description.setText(Main.jobList.toString());
      JScrollPane scroller = new JScrollPane(description);
      box2.add(scroller);
      scroller.setAlignmentX(Component.LEFT_ALIGNMENT);
      box3.add(sendBtn);
      box3.add(resolveBtn);
      
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
               int phone = Integer.parseInt(phoneNumber.getText());
               Main.jobList.resolve(phone, description.getText(), Main.CLOSED_FILE);
               phoneNumber.setText("");
               description.setText("");
            }
         });
     sendBtn.addActionListener(
         new ActionListener() {
            public void actionPerformed(
               ActionEvent e) {
                int phone = Integer.parseInt(phoneNumber.getText());
               Main.jobList.send(phone, description.getText());
               phoneNumber.setText("");
               description.setText("");
            }
         });
      frame.addWindowListener(
         new WindowAdapter(){
            public void windowClosing(
               WindowEvent e) {
               Main.jobList.save(Main.OPEN_FILE);
            }
         });
   }
}
