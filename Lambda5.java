package co.lambdas.Demo;

//Example with parameter and return type

//Functional Interface
interface IDemo5 {
	//int add(int a,int b);
	int sub(int p,int q);
}


public class Lambda5 {

	public static void main(String[] args) {
		
		// Lambda definition
		//IDemo5 objA =(int a,int b) -> a+b;
				
		// calling the Lambda function with parameter and return type
		//System.out.println("Sum =" + objA.add(25, 12));
		
		IDemo5 objB = (int p,int q) -> p-q;
		System.out.println("Sub =" + objB.sub(25, 12));

		
		
		
	}
}
