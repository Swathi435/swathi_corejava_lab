package swathi.project.lab3;
import java.time.*;
import java.util.*;
public class DaysDuration {
	
	
	   public static void main(String[] args)
	    {
	        LocalDate pdate = LocalDate.of(2020, 05,30);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	 
	     System.out.printf("\nDifference is %d years, %d months and %d days old:", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	  }
	}



	

	 


