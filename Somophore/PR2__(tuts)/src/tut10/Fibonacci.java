package tut10;

import static utils.TextIO.getInt;
import static utils.TextIO.put;
import utils.AttrRef;
import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;        
/**
 * @overview A recursive class to compute first n Fibonacci numbers 
 * @attributes
 * fibo   Set<Fibo>   Arrays<Fibo>
 * @object A typical Fibonacci object is fibo= {f1,f2,f3,f4,...,fn} where f1,f2,f3,f4,...,fn are fibonacci numbers
 * @abstract_properties
 * mutable(fibo)=true /\ optional(fibo)=false
 * 
 * @author ADMIN
 */
public class Fibonacci {
    @DomainConstraint(type="Set<Fibo>", mutable=true, optional=false)
    private Fibo[] fibo;
    /**
     * @effects 
     * initialize this as a sequence of the first n fibonacci numbers 
     */
    public Fibonacci(int n){
        fibo=new Fibo[n];
        for(int i=0;i<n;i++){
            fibo[i]=new Fibo(i+1);
        }
    }
   
    @Override
	public String toString() {
		return "Fibonacci [fibo=" + java.util.Arrays.toString(fibo) + "]";
	}
	/**
     * @overview 
     * A private class that represents a fibonacci number
     * @attributes
     * fibo   Integer   int 
     * 
     * @object A typical Fibo object is f=<fibo> where fibo is a fibonacci number
     * 
     * @abstract_properties
     * mutable(fibo)=true/\optional(fibo)=false
     * 
     * @author ADMIN
     */
    public class Fibo {
        @DomainConstraint(type="Integer", mutable=true,optional=false)
    private int fibo;
    /**
     * @effects Recursively construct this
     * @requires n>= 1
     */
    public Fibo(int n){
        if(n==0)
            fibo=0;
        else if (n==1)
        	fibo=1;
        else 
            fibo= new Fibo(n-1).fibo+new Fibo(n-2).fibo;
    }
    /**
     * @effects return <tt> this.fibo </tt>
     */
    @DOpt(type=OptType.Observer)@AttrRef("fibo")
    public int getFibo(){
        return this.fibo;
    }
    @Override
    public String toString(){
        return fibo+"";
    }   
} //end Fibo
    /**
    *The run method 
    * @effects initialize a <tt> Fibonacci </tt> and print it to the console 
    */
    public static void main(String[]args){
        put("In put a sequence of the first n Fibonacci numbers:\n n = ");
        int n= getInt();
        Fibonacci fibo = new Fibonacci(n);
        put(fibo);
    }
} // end Fibonacci

