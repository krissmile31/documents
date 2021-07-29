package tut6;

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
public class tut6 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a new password: ");
        String s = sc.nextLine();
        int score = 0;
        boolean upper = false, lower = false, digit = false, symbol = false;
        
        if (s.length() >= 8 && s.length() <= 12) {
            score++;
        }
        else if (s.length() > 12) {
            score = score + 2;
        }
        else {
            System.out.println("Password must have to be 8 characters or more!");
            return;
        }                                       
            
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                upper = true;
                
            }
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                lower = true;
                
            }
            else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                digit = true;
                
            }
            else if (s.charAt(i) == ' ') {
                System.out.print("Error...@@!!");
                break;
            }
            else {
                symbol = true;  
            } 
            
        }
        
        if (upper==true) score++;
        if (lower==true) score++;
        if (digit==true) score++;
        if (symbol==true) score ++;
        
        System.out.print("Strong: " + score);
        
        
        if (score == 1 || score == 2)
                System.out.print("(weak)");
              
        else if (score == 3 || score == 4) 
                System.out.print("(medium)");
               
        else if (score == 5 || score == 6)
                System.out.print("(strong)");  
               
        System.out.println();
        }
        
    }
    