package tut10;

public class Fibonacci {
	private int fibo;
	private int n;
	
	public Fibonacci(int n) {
		if (!validateN(n)) {
			System.err.println("Invalid input: " + n);
			return;
		}
		this.n = n;
		fibo = Fibo(n);
	}
	public int getFibo() {
		return fibo;
	}
	public boolean setN(int n) {
		this.n=n;
		fibo = Fibo(n);
		return true;
	}
	
	public boolean validateN(int n) {
		if (n < 0)
			return false;
		return true;
	}
	
	private int Fibo(int n) {
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else
			return Fibo(n-1)+Fibo(n-2);
	}
}
