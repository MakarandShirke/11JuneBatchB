package AbstractConcrete;

public class Base2 extends Base1 {
	
    // Implementation of Incomplete methods from Abstract class Base1
	
	
	public void whatsApp() {  
		System.out.println("Method whatsApp completed in concrete class");
		
	}
	
	public void Insta() {
		System.out.println("Method Insta completed in concrete class");
		
	}
	
	public void Twitter() {
		System.out.println("Method Twitter completed in concrete class");
		
	}
	
	public static void main(String[] args) {
		
		Base2 b = new Base2();
		b.facebook();
		b.whatsApp();
		b.Insta();
		b.Twitter();
	}


}
