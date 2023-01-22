package daytwojava;

public class Division {
public void division (int num1, int num2 ) {
	try {
	System.out.println("In Division");
	String name =null;
	System.out.println(name.length());
	
	int div = num1 / num2;
	System.out.println("Division = " + div);
}catch(ArithmeticException e) {
	System.out.println(e);
}
catch(NullPointerException e) {
	System.out.println(e);	
}
System.out.println("Division done");
}	
public void justFun() {
	try {
		System.out.println("Just enjoying");
		Thread.sleep(1000);
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	}
}