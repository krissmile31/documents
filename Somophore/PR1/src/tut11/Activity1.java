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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Activity1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);        
        BufferedWriter out = null;
        try {
            FileWriter f = new FileWriter("data.txt");
            out = new BufferedWriter(f);
        } catch (IOException ex) {
            System.out.println("Error!");
            System.exit(1);
        }
        System.out.print("Please enter your name: ");
        String s = sc.nextLine();
        try {
            out.write("Name: " + s);
            out.newLine();
            out.close();           
        } catch (IOException ex) {
            System.out.println("Write error!");
            System.exit(2);
        }
        
    }
    
}