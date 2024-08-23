package co.lambdas.Demo;

//Lambda with Generic functionality

//function interface
interface IDemo8<T>{
	
	T concate(T t, T t1);

}

public class Lambda9 {

	public static void main(String[] args) {

		// Lambda Implementation with String value
		IDemo8<String> s1 = (str1, str2) -> str1+str2;
		     
		// Lambda Implementation with double value
			IDemo8<Double> d1 = (d2, d3) -> d2+d3;
	        	System.out.println("String Lambda " + s1.concate("Vijaya", "Lakshmi"));
		System.out.println("Double Lambda " + d1.concate(23.45, 90.42));
		
		
		
		
		
		
		

	}

}
