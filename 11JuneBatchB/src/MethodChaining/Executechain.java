package MethodChaining;

public class Executechain {

	public static void main(String[] args) {
		
		Gamma a = new Gamma();
		
		 Beta b = a.Memo();
		Alpha c = b.Demo();
		// c.Test();  //  calling
		
		
		a.Memo().Demo().Test();  // Method Chaining
		

	}

}
