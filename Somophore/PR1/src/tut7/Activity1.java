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
public class Activity1 {
    
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A (A > 0): ");
        int a = sc.nextInt();
        System.out.print("Enter B (B > 0): ");
        int b = sc.nextInt();
        if (a>0 && b > 0) 
            System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a,b));
        else 
            System.err.print("Error...");
    }
    public static int gcd(int a, int b) {
        int c;
        while (b != 0) {
            c = a;
            a = b;
            b = c % b;                           
    }
       return a;
    
}
    }