/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notnamegenerator;

import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author extreme
 */
public class NotNameGenerator {
    
    
    private JFrame mainFrame;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //  new NotNameGenerator().createGUI();
     
//            int i = 0;
//          String[] table = new NotNameGenerator().readFile();
//         for (String x : table){
//             System.out.print(x+"\t");
//             if (i == 10){
//                 System.out.println("");
//                 i = 0;
//             }
//             i++;
//         }
            
    }
    
    public void createGUI(){
        mainFrame = new JFrame("Name Generator");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        mainFrame.setBounds(100, 100, 300, 300);
        mainFrame.setVisible(true);
    }
    
    
    
}
