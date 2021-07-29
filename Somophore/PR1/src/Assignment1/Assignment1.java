package Assignment1;

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
public class Assignment1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("1. Assignment1");
       System.out.println("2. assignment2");
       System.out.println("3. assignment3");
       System.out.println("4. assignment4");     
       System.out.println("Enter any key to exit(except above keys)");     
       int Rain;
      
        Rain = sc.nextInt();
        
        
       while(Rain > 0 && Rain < 5){
        
       switch (Rain) {
          case 1: {
              System.out.print("Enter an integer: ");
              String s = "";
              int a = sc.nextInt();
              while (a!=0) {
                int b = a%2;
                s = b + s;
                a = a/2;
            }
              System.out.println("Equivalent Binary: " + s);
              break;
    }
              
          case 2:  {
              System.out.print("m = ");
              int m = sc.nextInt();        
              System.out.print("n = ");
              int n;
              do {
              n = sc.nextInt();
              } while (n<1 || n>5);       
              double s = 0;
              for (int i = 0; i<n; i++) { // stop when i = n -1 
              s = Math.sqrt(m + s);
           
             }
              System.out.println("-> s = " + s);
              break; 
          }
                      
          case 3: {
              // read from user
              System.out.print("a = ");
              double a = sc.nextDouble();
              System.out.print("b = ");
              double b = sc.nextDouble();
              System.out.print("c = ");
              double c = sc.nextDouble();
        
              //** 2 roots x1, x2
              double x1;
              double x2;
              //** Delta
              double S = b*b - 4*a*c;
              if (S<0) {
                System.out.println("The equation has no real root.");
        }
              else {
                System.out.println("The equation has two roots: x1, x2");
                x1 = (-b + Math.sqrt(S))/(2*a);
                x2 = (-b - Math.sqrt(S))/(2*a);
                System.out.println("=> x1 = " + x1);
                System.out.println("x2 = " + x2);
    }         break;
       }
             
           case 4: {
               System.out.print("n = ");
               //"Enter an integer...."
               int n;
               do {
               n = sc.nextInt();          
               } while (n<1 || n >5);        
               for (int i = 1; i<=n; i++) {
               for (int j = n-1; j>=i; j--) {
               //Print the spaces
               System.out.print(" ");
            }
               for (int t = 1; t<=(2*i-1); t++) {
               //Print the stars
               System.out.print("*");
           }           
               System.out.println("");
        }
               break;
        }   
    }  
       
            Rain = sc.nextInt();
       }
 sc.close();

}
}
