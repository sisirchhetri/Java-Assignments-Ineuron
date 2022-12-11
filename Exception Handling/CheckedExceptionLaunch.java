package in.sisirchhetri;

class Demo{
	
	//Checked Exception - throws keyword ducks the exceptions.
	//and hence here it  propagates the exception (if occurs) to the caller method
	public void action() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Inside Method starts");
		
	}
}


public class CheckedExceptionLaunch {
	//here using throws, cause void action() throws an exception & we also 
	// want to duck it & it  transfer to the Default Exception Handler
	public static void main(String[] args) throws InterruptedException   {	
		System.out.println("Main Method starts");
		new Demo().action();
		
	}
}
