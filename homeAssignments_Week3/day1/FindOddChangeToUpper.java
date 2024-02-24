package homeAssignments_Week3.day1;

public class FindOddChangeToUpper {
	//Change Odd Index To Uppercase
	public static void main(String[] args) {
	   String str = "changeme";
	   
	   String[] split = str.split("");
	    //iterate the values from split
	    for (int i = 0; i < split.length; i++) {
	    	
	    	if(i%2!=0) {
	    		
	    		System.out.print(split[i].toUpperCase());
	    		 
	    	}
	    	else
	    	{
	    		System.out.print(split[i]);
	    	}
	    }	  
	}}


