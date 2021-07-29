package tut9;

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
public class Tut9 {    
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int n = 0;
        while (n!=7) {
            System.out.println("[1] BMI calculator");
            System.out.println("[2] Coin converter");
            System.out.println("[3] Leap year checker");
            System.out.println("[4] Quadratic equation solver");
            System.out.println("[5] Password strength meter");
            System.out.println("[6] GCD finder");
            System.out.println("[7] Quit");
            
            System.out.print("Choose an option: ");
            n = sc.nextInt();
            
        switch(n) {
            case 1:
                System.out.print("\nEnter your weight(kg): ");
                double weight = sc.nextDouble();
                System.out.print("Enter your height(m): ");
                double height = sc.nextDouble();
                
                double BMI = weight/(height*height);
                System.out.println("Your BMI: " + BMI + "(kg/m2) \n");
                break;
            case 2:
                System.out.print("\nEnter the number of Xu's (xu): ");
                int X = sc.nextInt();
                
                int quan = X/10000;
                X = X%10000;
                int dong = X/100;
                int hao = X%100/10;
                int xu = X%100%10;
                System.out.println(quan+" quan "+dong+" dong "+hao+" hao "+xu+" xu \n");
                break;
            case 3:
                System.out.print("\nEnter a year:\n" + "For y = ");
                int y = sc.nextInt();
                
                if ((y%400==0) || (y%4==0 && y%100!=0))
                    System.out.println("The year " + y + " is a leap year. \n");
                else
                    System.out.println("The year " + y + " is not a leap year. \n");
                break;
            case 4:
                System.out.println("\nEnter 3 real numbers: ");
                System.out.print("a = ");
                double a = sc.nextDouble();
                System.out.print("b = ");
                double b = sc.nextDouble();
                System.out.print("c = ");
                double c = sc.nextDouble();
                
                double S = b*b-4*a*c;
                double x1, x2;
                
                if (S<0)
                    System.out.println("The equation has no real root! \n");
                else {
                    System.out.println("The equation has 2 roots x1, x2: ");
                    x1 = (-b+Math.sqrt(S))/(2*a);
                    x2 = (-b-Math.sqrt(S))/(2*a);
                    System.out.println("x1 = " + x1 + "\nx2 = " + x2 + "\n");
                }
                break;
            case 5:
                System.out.print("\nEnter a new password: ");
                String s = sc.next();
                int score = 0;
                boolean upper = false, lower = false, digit = false, symbol = false;
                
                if (s.length() >= 8 && s.length() <= 12)
                    score++;
                else if (s.length() > 12)
                    score = score + 2;
                else {
                    System.out.println("Password must have to be 8 characters or more! \n");
                    break;
                }
                for (int i = 0; i<s.length(); i++) {
                    if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                        upper = true;
                    else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                        lower = true;
                    else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                        digit = true;
                    else if (s.charAt(i) == ' ') {
                        System.out.println("Password mustn't have spaces!!! \n");
                        break;
                    }
                    else
                        symbol = true;
                }
                if (upper == true) score++;
                if (lower == true) score++;
                if (digit == true) score++;
                if (symbol == true) score++;
                
                System.out.print("Strength: " + score);
                
                if (score==1 || score==2)
                    System.out.print("(weak) \n");
                if (score==3 || score==4)
                    System.out.print("(medium) \n");
                if (score==5 || score==6)
                    System.out.print("(strong) \n");
                System.out.println();
                break;
            case 6: 
                System.out.print("\nEnter A (A>0): ");
                int A = sc.nextInt();
                System.out.print("Enter B (B>0): ");
                int B = sc.nextInt();
                if (A>0 && B>0)
                    System.out.println("GCD(" + A + ", " + B + ") = " + gcd(A,B));
                else
                    System.out.println("Invalid input! \n");
                
                System.out.println();
                break;
            case 7:
                System.out.println(" \n Good bye!!! \n");
                break;
            default:
                System.out.println("\n Invalid Input!!! \n");
         
        }
        }
    }
    public static int gcd(int A, int B) {
        while (B!=0) {               
            int C;
            C = A;
            A = B;
            B = C%B;
        } 
        return A;
    }
    
}