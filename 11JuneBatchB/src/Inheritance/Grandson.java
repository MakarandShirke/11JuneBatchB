package Inheritance;

public class Grandson extends father{
	
	public void Scooter() {
		
		System.out.println("Scooter");
		
	}
	
	public static void main(String[] args) {
		
		Grandson g = new Grandson();
		g.Scooter();
		g.car();
		g.money();
		g.Home();
		
		System.out.println("============================");
		
		son s = new son();
		s.Bike();
		s.car();
		s.Home();
		s.money();
		
		
	}

}
