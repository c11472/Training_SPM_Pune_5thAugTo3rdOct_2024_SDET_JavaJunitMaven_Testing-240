package co.lambdas.Demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList <Integer> rollno = new ArrayList( List.of(1,2,4,5));
		   System.out.println(rollno);
		   
		   LinkedList<String> NameList = 
				   new LinkedList(List.of("gayatri", "sunidhi"));       
	       System.out.println(NameList);
	       
	       ArrayList<Double> sal = 
	    		   new ArrayList<Double>(List.of(56000.90,98000.89));
	       System.out.println(sal); 
	}
}
