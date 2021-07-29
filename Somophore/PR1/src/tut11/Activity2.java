package tut11;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HT
 */
import java.io.File;
import java.util.Scanner;
public class Activity2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			File f = new File ("data.txt");       
			if (f.exists()) {
			    System.out.println("File " + f + " is existing. Do you want to delete the file (yes/no)?");
			    String s = sc.next();
			    if (s.equalsIgnoreCase("yes")){
			        f.delete();
			        System.out.println("File was deleted!");          
			    }
			    else
			        System.out.println("You can interact with it!");               
			}
			else
			    System.out.println("The file does not exist!");
		}
    }
}
