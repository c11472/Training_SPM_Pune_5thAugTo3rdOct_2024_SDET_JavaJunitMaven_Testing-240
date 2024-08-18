
/*
 * Passing parameters to method
 */

package com.programs.day2;

public class day2_p5PassingParametersToMethod {
	
	String param1;
	String param2;
	int param3;
	
	public void TrainingDetails(String TraingRoomId , String TrainerCode , int Participantscount) {
	  this.param1=TraingRoomId;
	  this.param2=TrainerCode;
	  this.param3=Participantscount;
	  System.out.println(this.param1);
	  System.out.println(this.param2);
	  System.out.println(this.param3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		day2_p5PassingParametersToMethod obj = new day2_p5PassingParametersToMethod();
		obj.TrainingDetails("Testing Room 240", "TRC05", 23);

	}

}
