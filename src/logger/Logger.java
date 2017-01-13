/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Logger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          FileWriter  out;
        
          Scanner a =new Scanner (System.in);
          System.out.println("Inserici una parola: ");
          String i = a.nextLine();
    
     try {
            
            out = new FileWriter("data/log.txt");
            out.write(i);
            out.close();

            
            }catch(FileNotFoundException ex){
                System.out.println("Errore" + ex.getMessage());
           
            }catch(IOException ex){
                System.out.println("Errore"+ ex.getMessage());
                   
        }
    }
}
    
    
  
    

