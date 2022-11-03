package String;

public class Basic {
	
	public static void main(String[] args) {
		
		String a = "Velocity";
		String b = "Velocity";
		
		String c = new String ("Velocity");
		String d = new String ("Velocity");
		
		
		System.out.println(a==b);   //True
		System.out.println(c==d);    //False
		System.out.println(a==d);    //False
		
		
		System.out.println("--------------------------------------------");
		
		b = "Class";
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);
		
		System.out.println("---------------------------------------------");
		
		b = "Velocity";
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);
		
		
		
		
		
		
		
		
		
		
		
	}

}
