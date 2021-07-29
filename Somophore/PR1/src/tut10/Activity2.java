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
public class Activity2 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);   
      int n;
      do {
      System.out.print("n = ");
      n = sc.nextInt();
      if (n >= 0) 
         System.out.println("fibo(" + n + ") = " + fibo(n)); 
      else
          System.err.println("Invalid input!");
      } while (n<0);
  } public static int fibo(int n) {
      if (n==0)
          return 0;
      else if (n==1)
          return 1;
      else 
          return fibo(n-1)+fibo(n-2);
      
          
  }
  
}
