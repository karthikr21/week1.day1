package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;  // firstNum 
int b=1;  // secNum 
int c=8;  // range 


System.err.println("The first Number is "+ a);   // Print first number

for (int i=0;i<c;i++) {
	
	int d=a+b;   // add first and second number assign to sum
	a=b;      // Assign second number to the first number
	b=d;   // Assign sum to the second number
	System.out.println("the sum is " + d );  // print sum
}

	
	}

}


