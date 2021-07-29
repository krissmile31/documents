package tut5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HT
 */
import java.util.Scanner;
public class Activity2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);               
        System.out.print("Enter amount: ");
        String s = sc.nextLine();
        
    
        if (s.charAt(0) == '$' )  {
            String e = s.substring(1, s.length());
            double l = Double.parseDouble(e);
            System.out.println(s + " = " + l*23500 +" VND");

        } 
        else if (s.length()>4 && s.substring(s.length()-3, s.length()).equals("EUR")) {    
            String i = s.substring(0, s.length()-3);
            double j = Double.parseDouble(i);
            System.out.println(s + " = " + j*27100 + " VND");

        }
        else 
            System.out.println("Invalid input!!!"); 
        
        
        
        
    }
  }  

