package co.lambdas.Demo;

//block Lambda

interface MyString {
	String myStringFunction(String str);
}

public class Lambda8 {
	
	public static void main(String[] args) {
		
		// Block lambda to reverse string
		MyString reverseStr = (str) -> {
			String result = "";
			
			for(int i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);
			    return result;
		};
		
		// Output: Mother
		
		System.out.println(reverseStr.myStringFunction("QulityControl")); 
		
	}
}
