package co.lambdas.Demo;

interface IDemo4{
	void add();
}
public class Lambda4 {

	public static void main(String[] args) {
		
		// Lambda without parameter and return type
		IDemo4 objA= () -> 	{
		System.out.println(9+10);
		System.out.println("Test automation");
		};
		
	
     objA.add();
				
	}

}

