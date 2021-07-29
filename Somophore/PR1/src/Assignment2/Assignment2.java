package Assignment2;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class Assignment2 {

    private static int[] ids;
    private static String[] names;
    private static double[] prices;
    private static int[] quantities;
    private int ID;
    private String Name;
    private double Price;
    private int Quantity;

    public Assignment2 (int id) {
        this.ID = id;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
  
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Assignment2[] p = new Assignment2[30];
        int m = 0; // current products
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------MENU-----------");
        System.out.println("1. Add products");
        System.out.println("2. Display products");
        System.out.println("3. Delete a product");
        System.out.println("4. Edit a product");
        System.out.println("5. Search for products by name");
        System.out.println("6. Sort products by price");
        System.out.println("7. Save products to text/binary file");
        System.out.println("8. Load products from the saved file");
        System.out.println("0. Exit");
        
        while (true) {   
        
        
        int n = sc.nextInt();                
        
        if( n == 1) {
            System.out.println("Enter the product ID: ");
            int id = sc.nextInt(); 
            sc.nextLine();
            System.out.println("Enter the product name: ");
            String name = sc.nextLine();
            System.out.println("Enter the product price: ");
            double price = sc.nextDouble();
            System.out.println("Enter the quantity: ");
            int quantity = sc.nextInt();
            
            p[m] = new Assignment2(id);
            p[m].setName(name);
            p[m].setPrice(price);
            p[m].setQuantity(quantity);
            // m increase to 1 after adding 1 product 
            m++;  // maximum: 30 products
            
            
        }
       
        if( n == 2 ) {
            if( m == 0 ) {
                System.out.println("The empty list");
            }            
            else{
                System.out.format("%-10s%-10s%-10s%-10s\n","ID","Name","Price","Quantity");
                for (int i = 0; i < m; i++ ){                         
                    System.out.format("%-10d%-10s%-10.3f%-10d\n",
                           p[i].getID(),p[i].getName(),p[i].getPrice(),p[i].getQuantity());            
                }
            }
        }
    
        if( n == 3) {
            System.out.println("Enter the product ID(product needs deleting): ");
            int del = sc.nextInt();
            for( int i = 0; i < m; i++){ // run to file the element that need to be deleted
                if ( p[i].getID() == del){ // examine in list that have the id of deleted product?
                    // if have 
                    p[i] = p[m-1]; 
                    p[m-1] = new Assignment2(-1);
                    m --;// decrease to 1
                    
                    break;   // end, not find
                }
                if ( i == m-1 && p[i].getID() != del) {
                    System.out.println("Can't find the product that needs to be deleted");
                }
            }
        }
        
        if ( n == 4 ){
            System.out.println("Enter the product ID(product needs editing): ");
            int edit = sc.nextInt();
            for( int i = 0; i < m; i++){   // run to file the element that need to be edited
                if ( p[i].getID() == edit){   // examine in list that have the id of edited product?
                    // if have
                    System.out.println("Enter new name: ");
                    sc.nextLine();
                    String newName = sc.nextLine();
                    p[i].setName(newName);
                    
                    System.out.println("Enter new price: ");
                    double newPrice = sc.nextInt();
                    p[i].setPrice(newPrice);
                    
                    System.out.println("Enter new quantity: ");
                    int newquantity = sc.nextInt();
                    p[i].setQuantity(newquantity);
                    
                    break;   //end.

                }
                if ( i == m-1 && p[i].getID() != edit) {
                    System.out.println("Can't find the product that needs to be edited");
                }
            }
        }
        
        if( n == 5 ){
            System.out.println("Enter a keyword: ");
            sc.nextLine();
            String key = sc.nextLine();
            
            System.out.format("%-10s%-10s%-10s%-10s\n","ID","Name","Price","Quantity");
            for( int i = 0; i < m; i++){
                int s = 0;
                for(int j = 0; j < key.length(); j++){
                    for(int z = 0; z < p[i].getName().length(); z++){
                        if ( key.charAt(j) == p[i].getName().charAt(z)) {
                            s++;
                            break;
                        }
                    }
                    if( key.length() == s){
                        System.out.format("%-10d%-10s%-10.3f%-10d\n",
                            p[i].getID(),p[i].getName(),p[i].getPrice(),p[i].getQuantity());
                    }                  
                }
            }
             
        }
        
        
        if( n == 6 ) {
            for (int i = 0; i < m-1; i++){
                for(int j = i+1; j < m; j++){
                    if( p[i].getPrice() > p[j].getPrice() ){
                        Assignment2 tg = p[i];
                        p[i] = p[j];
                        p[j] = tg;
                    }
                }
            }
        }
            
        
        if( n == 7 ){           
            File f = new File("data.bin");
            FileOutputStream out = new FileOutputStream(f);
            try (ObjectOutputStream h = new ObjectOutputStream(out)) {
                h.writeObject(ids);
                h.writeObject(names);
                h.writeObject(prices);  
                h.writeObject(quantities);
            }
            
            
           
        }
        
        if( n == 8 ){
            File f = new File("data.bin");
            FileInputStream in = new FileInputStream(f);
            try (ObjectInputStream k = new ObjectInputStream(in)) {
                ids = (int []) k.readObject();
                names = (String[]) k.readObject();
                prices = (double[]) k.readObject();
                quantities = (int []) k.readObject();
                k.close();
            }
        
        }
        
        if( n == 0 ) break;
        
        System.out.println("\n--------------DONE.!!!-----------\n");
    }
    
}
     
}

