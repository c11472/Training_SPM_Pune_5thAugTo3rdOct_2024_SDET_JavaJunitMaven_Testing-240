package co.lambdas.Demo;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class LocalDateAndTime {
	public static void main(String args[]) 
	{
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/DD  HH:MM:SS");  
		  LocalDateTime t1 = LocalDateTime.now();  // Local date ----Current Data as per the zone  
		  System.out.println(dtf.format(t1)); 
		  Chronology num = t1.getChronology(); //ISO
		 System.out.println(num);
		  System.out.println(t1.getMonthValue()); // 8
		  
		  int p=t1.getDayOfMonth(); //23
		  System.out.println(p);
		  
		  int p1=t1.getYear(); //2024
		  System.out.println(p1);
		  
		  int p2= t1.getDayOfYear(); //236
		  System.out.println(p2);
		  
		  //***************************************************************
		  SimpleDateFormat sdf = new SimpleDateFormat("12/12/2005");
		  
		  Calendar c = Calendar.getInstance();
		  // c.setTime(new Date()); // Using today's date
		  c.add(Calendar.DATE, 15); // Adding 5 days
		  
		  String output = sdf.format(c.getTime());
		  System.out.println(output);
	  
	}
}
