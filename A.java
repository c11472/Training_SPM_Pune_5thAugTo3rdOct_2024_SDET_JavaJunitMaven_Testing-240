package co.lambdas.Demo;
class B{
	
	B(){
		//init
		System.out.println("hello");
		
	}
}
public class A  extends B{
	A(){
		super(); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println("world");
       B obj = new B();
       int num=5;
	   int p=++num;
	System.out.println(++p);
       
	}

}
