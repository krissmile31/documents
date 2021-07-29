package tut3.vehiclex;

import tut3.vehiclex.Bus;
import tut3.vehiclex.Car;
import tut3.vehiclex.Vehicle;
import utils.NotPossibleException;

/**
 * @overview A test application for vehicles.
 * 
 * @author dmle
 */
public class VehicleApp {
    public static void main(String[] args) {
    	
    	 /**
    	  * @effects create objects
    	  */
    	
    	// Bus 
        Vehicle b1, b2, b3;
        System.out.println("-----------BUS----------");
        //valid Bus
        try {
        	b1 = new Bus("b1",3.0,3.0,10.0,6000,40);
        	
        	System.out.println("Vehicle " + b1.getName() + ", weight: " + b1.calcTotalWeight());
        	System.out.println();
        	
        } catch (NotPossibleException e)  {
        	System.err.println(e.getClass() + ": " + e.getMessage());
        	e.printStackTrace(); 
        	
        }
        
        //invalid weight
        try {
        	b2 = new Bus("b2",3.0,3.0,10.0,4000,40);
        	
        	System.out.println("Vehicle " + b2.getName() + ", weight: " + b2.calcTotalWeight());
        	
        } catch (NotPossibleException e)  {
        	System.err.println(e.getClass() + ": " + e.getMessage());
//        	e.printStackTrace();	
        	System.out.println();
        }
        //  invalid seatingCapacity
        try {
        	b3 = new Bus("b3",3.0,3.0,10.0,6000, 25);
        	System.out.println("Vehicle " + b3.getName() + ", weight: " + b3.calcTotalWeight());
        	
        } catch (NotPossibleException e) {
        	System.err.println(e.getClass() + ": " + e.getMessage());
//        	e.printStackTrace();
        	System.out.println();
        }
        
        // Car
        Vehicle c1, c2, c3;
        System.out.println("-------------CAR--------------");
        
        // valid Car
        try {
        	c1 = new Car("c1",1.5,1.5,2.5,1500,4);    
        	System.out.println("Vehicle " + c1.getName() + ", weight: " + c1.calcTotalWeight());
        	System.out.println();
        } catch (NotPossibleException e) {
        	System.err.println(e.getClass() + ": " + e.getMessage());
        	e.printStackTrace();
        	
    }
        
        // invalid weight
        try {
        	c2 = new Car("c2",1.5,1.5,2.5,2500,4);
        	System.out.println("Vehicle " + c2.getName() + ", weight: " + c2.calcTotalWeight());
        	
        } catch (NotPossibleException e) {
        	System.err.println(e.getClass() + ": " + e.getMessage());
//        	e.printStackTrace();
        	System.out.println();
        }
        
        //invalid name
        try {
        	c3 = new Car(null,1.5,1.5,2.5,1500,9);
        	System.out.println("Vehicle " + c3.getName() + ", weight: " + c3.calcTotalWeight());
        } catch (NotPossibleException e) {
        	System.err.println(e.getClass() + ": " + e.getMessage());
//        	e.printStackTrace();
        	System.out.println();
        }
        
        //invalid seatingCapacity
        try {
        	Vehicle c4 = new Car("c4",1.5,1.5,2.5,2000,9);
        	System.out.println("Vehicle " + c4.getName() +", weight: "+ c4.calcTotalWeight());
        } catch (NotPossibleException e) {
        	System.err.println(e.getClass() + ": " + e.getMessage());
//        	e.printStackTrace();
        	
        }
    }
    
}

