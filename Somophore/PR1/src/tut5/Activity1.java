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
public class Activity1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String s = "";
        String p = "";        
        System.out.print("Enter your name: " );
        s = sc.nextLine();
        System.out.print("Enter your password: ");
        p = sc.nextLine();
        
        switch(s) {
            case "andrew":    
                if ( p.equals("5ecr3t")) {
                    System.out.println("Welcome, " + s + "!");
                break;                
        }
                else
                    System.out.println("Wrong password, "  + s + "!");
            case "matt":
                if ( p.equals("goody2shoes")) {
                    System.out.println("Welcome, " + s + "!");
                break;
        }
                else
                    System.out.println("Wrong password, "  + s + "!");
            case "gary":
                
                if ( p.equals("mewtwo")) {
                    System.out.println("Welcome, " + s + "!");
                break;
        }
                else
                    System.out.println("Wrong password, "  + s + "!");
            default:
                
                System.out.println("I don't know you!");
                
            
        
    }
}
}