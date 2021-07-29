package tut1_2.Vehicles;

/**
 * @overview A test application for vehicles.
 * 
 * @author dmle
 */
public class VehicleApp {
    public static void main(String[] args) {
        // create objects
    	Vehicle v1 = new Bus("b1",3.0,3.0,10.0,6000.0,40, "a");
        Vehicle v2 = new Car("c1",1.5,1.5,2.5,1500.0,4, "hjg");
        Vehicle v3 = new Boat("b2", 5, 6, 5, 6, 5, "j");
        Vehicle v4 = new Motorbike("m1", 5, 6, 5, 6, 5,"hk");
        // use objects
        System.out.println("Vehicle " + v1.getName() + 
            ", weight: " + v1.calcTotalWeight());
        System.out.println("Vehicle " + v2.getName() + 
            ", weight: " + v2.calcTotalWeight());
        System.out.println(v3);
        System.out.println(v4);
    }
}
