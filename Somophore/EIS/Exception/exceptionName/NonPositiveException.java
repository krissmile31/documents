package exceptionName;

// default constructor
public class NonPositiveException extends RuntimeException {
	
	//single-argument constructor: error message
	public NonPositiveException(String msg) {
		
		//invoke suitable super constructors
		super(msg);
	}
}

// exception name = type of error + "Exception"
// NullPointerException
// DivideByZeroException
// DiskAccessException
//unchecked: RuntimeException
