package co.lambdas.Demo;

interface NumericTest {
	boolean computeTest(int n); 
}

public class Lambda7 {

	public static void main(String[] args) {

		// Lambda Definition
		NumericTest isEven = (n) -> n%2==0;  // checks whether it is even no
		NumericTest isOdd = (n) -> n%2 != 0;  // checks for the odd no
		NumericTest isNegative = (n) -> (n < 0);  // checks for the negative no

		// calling the Lambda Methods
		System.out.println("Even No ?" + isEven.computeTest(8));
		System.out.println("Odd No ?" + isOdd.computeTest(8));
		System.out.println("Negative No ?" + isNegative.computeTest(-7));
		
}
}
