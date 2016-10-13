/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notnamegenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author extreme
 */
public class Name {
    
    private static File file = null;
    private static String[] names = null;
    
    
    private static void readFile(){
        file = new File("names.csv");
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                names = line.split(" ");
            }
        } catch (FileNotFoundException e) {
          //  JOptionPane.showMessageDialog(new JFrame("File Error"), ("File doesn't exist!" + e));
            System.out.println("File doesn't exist!" + e);
            
        } catch (IOException e){
         //   JOptionPane.showMessageDialog(new JFrame("Stream Error"), ("Stream filed." + e));
            System.out.println("Stream filed." + e);
        }
        finally{
                if(reader != null){
                    try {
                        reader.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(new JFrame("Error"), e);

                    }
                }
        }
        
    }
    
    private static String randomWord(){
        int tableSize = names.length;
        int position = (int) (Math.random() * tableSize);
        return names[position];
    }
    
    private static String createSyllable(){
        int numberOfLetter = (int) (Math.random() * 3 + 2);
        int beginOfSyllable = (int) (Math.random() * 4 + 5);
        int endOfSyllable = beginOfSyllable + numberOfLetter;
        String word = "";
        word = randomWord();
        
        String syllable = "";
        syllable = word.substring(beginOfSyllable, endOfSyllable);
        
        
        
        return "";
    }
    
    
}
