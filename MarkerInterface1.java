package co.lambdas.Demo;
//Empty Interface
interface MarkerOne {
	
}

class Test2 implements MarkerOne{
	 public void samplemethod1() {
		 System.out.println("Accessing marker");
	 }
}
class MarkerInterface1 extends Test2 {
	public static void main(String args[]) {
		MarkerInterface1 obj = new MarkerInterface1();
		obj.samplemethod1();
		
	}

}
