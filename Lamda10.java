package co.lambdas.Demo;
//Lambda as method argument
interface MyString1 {
	String myStringFunction(String str);
}

public class Lamda10{
	// Method which takes Lambda as function parameters
	public static String reverseStr(MyString1 reverse, String str){
		  return reverse.myStringFunction(str);
		}
	
	public static void main(String[] args) {
		// Block lambda to reverse string
		// Block lambda to reverse string
		MyString1 reverse = (str) -> {
			String result = "";
			
			for(int i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);
			
			    return result;
		};
				// Output: Mother
				
		System.out.println(reverseStr(reverse, "rehtoM")); 
	}
}

//https://beginnersbook.com/2017/10/java-lambda-expressions-tutorial-with-examples/
