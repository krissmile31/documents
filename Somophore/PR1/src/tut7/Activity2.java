package tut7;

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
    public static int positiveInt() {
        Scanner sc = new Scanner (System.in);
        int x;
        System.out.print("Enter an integer between 10 and 20: ");
        x = sc.nextInt();
        while  (x<10 || x>20) {
            try {
                System.out.print("But you must enter an integer between 10 and 20: ");
                x = sc.nextInt();
            } catch (Exception e) { 
                sc.nextLine();
            }  
        } return x;
         }  
                                       
    public static void main (String [] args) {
        int a = positiveInt();       
        System.out.print("Thank you, " + a + " it is!");
                
        System.out.println();
    }
}
