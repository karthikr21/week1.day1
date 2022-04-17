package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		int n = 13;   // Declare an int Input and assign a value 13

		boolean b = false; // Declare a boolean variable flag as false
		 
   for (int i=2; i<n/2; i++) {
		   
	   if (n % i == 0) {
		   
		   b=true;
		  
		   break;
		} 
   }
	   
	 if   (!b) {
		 System.out.println("n is a Prime number");
	 }
	 
	   	   
	   else {
		   System.out.println("n is not a Prime number");
	
	   }

}
}



