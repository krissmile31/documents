package tut8;

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
public class tut8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        
        while(a!=5){
           System.out.println("[1] Add item");
           System.out.println("[2] Item list");
           System.out.println("[3] Edit an item");
           System.out.println("[4] Remove an item");
           System.out.println("[5] Quit"); 
           System.out.print("Choose an option: ");
           a = sc.nextInt();
                        
        switch(a) {
            case 1: 
                System.out.println("\n Adding a new item... \n");
                break;
            case 2:
                System.out.println("\n Listing all items... \n");
                break;
            case 3:
                System.out.println("\n Editing item... \n");
                break;
            case 4:
                System.out.println("\n Removing item...\n ");
                break;
            case 5:
                System.out.println("\n Goodbye! \n");
                break;
            default:
                System.out.println("\n Invalid input!! \n");
    
            }
        
        }
       
    }
    
}
