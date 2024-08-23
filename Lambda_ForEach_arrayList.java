package co.lambdas.Demo;

import java.util.ArrayList;

public class Lambda_ForEach_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    ArrayList<String> cities = new ArrayList<String>();
	    cities.add("Pune");
	    cities.add("Kochin");
	    cities.add("Mumbai");
	    cities.add("Hyderabad");
	    
	    
	    
	    //Traversing the list using Lambda 
	    cities.forEach( (A) -> {
	    	System.out.println(A); 
	    	} );
	}

}
