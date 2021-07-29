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
public class Activity4 {
    
    public static String Bin() {
        Scanner sc = new Scanner (System.in);
        String s = "";        
        System.out.print("Enter an enteger: ");
        int a = sc.nextInt();
        if (a==0) 
            System.out.format("Bin(%d) = 0\n", a);
        if (a>0)
            System.out.format("Bin(%d) = ", a);
        while (a!=0){
            if (a<0){
            System.err.println("Invalid input");
            break;
            }
            else {
                int b = a%2;
                s = b + s;
                a = a/2;            
            }            
        }
        return s;
    }
    public static void main(String [] args) {
        String m = Bin();
        System.out.println(m);
       
    }
    
}