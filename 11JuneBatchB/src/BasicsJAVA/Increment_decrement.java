package BasicsJAVA;

public class Increment_decrement {
	public static void main(String[] args) {
		
	int x = 10;
	
  // Post Increment & Pre Increment
	
	System.out.println(x++);   //10 (output shows 10 but in JVM Stores as 11)
	System.out.println(x);     //11 (output 11 which store in JVM after x++)
	System.out.println(++x);   //12 (In output of X add 1 i.e 10+1 = 11)
	
	
 // Post Decrement & Pre Decrement
	
	System.out.println(x--);   //12  (Here after above Increment process its final Output value i.e 12 taken.Output shows 12 but in JVM Stores as 11)
	System.out.println(x);	 // 11 (output 11 which store in JVM after x--)
	System.out.println(--x);  //10 (In output of X subtract 1 i.e 11-1 = 10)
		
		
		
		
		
		
		
		
		
		
		
		
	}
}