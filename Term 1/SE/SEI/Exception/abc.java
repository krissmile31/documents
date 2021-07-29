
public class abc {
	public static void main(String[] args) {
		int n = 10;
		try {
		 int f = fact(n);
		 System.out.println("fact("+n+"): " + f);
		} catch (NonPositiveException e) {
		 // handle exception
		} 
	}

}
