package com.programs.day3;

public class HiddenFrameworks {
		private String empname ;
		private String empid;
		
		public HiddenFrameworks(String enm , String id) {
			this.empname=enm;
			this.empid=id;
			
		}
		//get for empname
		public String GetName() {
			return empname;
		}
		
		public void setName(String name) {
			this.empname=name;
		
			
		}
				
		public String GetID() {
			return empid;
		}
		
		public void setID(String id1) {
			this.empid=id1;
		
		}
	}


