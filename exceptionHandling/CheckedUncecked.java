package exceptionHandling;

public class CheckedUncecked {

	//Unchecked Exception 
	//here we don't have to declare that method 
	// will throw exception
	static void m1() {
		throw new ArithmeticException();
	}
	//Checked Exception 
	//Here We've to method , that this method will
	// throw exception
	static void m2() throws ClassNotFoundException {  
		throw new ClassNotFoundException();
	}
	public static void main(String[] args) {
		m1(); //for Unchecked exception
			  // compiler doesn't check for exception
		try {
		  m2();
		}catch(ClassNotFoundException e) {
			System.out.println("Checked Exception handled.");
		}
	}
}
