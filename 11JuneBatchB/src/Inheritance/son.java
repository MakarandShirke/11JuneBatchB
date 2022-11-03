package Inheritance;

public class son extends father {
	
	public void Bike() {
		
		System.out.println("Bike");
	}
	
	public static void main(String[] args) {
		
		son s = new son();
		
		s.Bike();
		s.car();
		s.money();
		s.Home();
		
		
		
	}

}
