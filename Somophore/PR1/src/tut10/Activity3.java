package tut10;


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
public class Activity3 {
    
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
        System.out.print("Enter a positive integer: ");
        a = sc.nextInt();
        if (a>=1) 
           System.out.println(a + "! = " + factorial(a));
        else
            System.err.println("Invalid input!"); 
        } while (a<1);
    }
    
    public static int factorial(int a) throws Exception {
        if (a<1)
            throw new Exception("Invalid input!");
        else if (a==1)
            return a;
        else
            return a * factorial(a-1);
                
               
        }
        
    }

