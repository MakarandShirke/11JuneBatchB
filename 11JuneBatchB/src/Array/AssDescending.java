package Array;

import java.util.Arrays;

public class AssDescending {
	
	public static void main(String[] args) {
		
		int a[]  = {10,50,30,80,60};  // Declaration of Array
		
		System.out.println("***Print Array all information***");
		
		for(int i=0; i<=a.length-1; i++) {
			
			System.out.println(a[i]);
			
		}
		
	//	System.out.println(a[1]);
		
		System.out.println("***Array all information in descending Order***");
		
		Arrays.sort(a);
		
            for(int i=0; i<=a.length-1; i++) {
			
			System.out.println(a[i]);
            
            }
            
          //  System.out.println(a[1]);
            
            System.out.println("***Array all information in Ascending Order***");
           
            for(int i = a.length-1; i>=0; i--) {
            	
            	System.out.println(a[i]);
            	
            	
            }
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
