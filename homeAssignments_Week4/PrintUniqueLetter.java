package homeAssignments_Week4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueLetter {

	public static void main(String[] args) {
		
		//input ="google" //output= gole
		String companyName ="google";
		//convert to array to store in LinkedHashSet to maintain insertion order
		//add values one by one to set and duplicate values not added to set
		char [] chname = companyName.toCharArray();
		Set<Character>cmpname = new LinkedHashSet<>();

		for(Character printunique :chname) {

			cmpname.add(printunique);
		}	
		
		//after adding unique values to set 
		//Use list to get the output specified in assignment
		List<Character>cmpnamelist = new ArrayList<>(cmpname); 
		for(int i=0;i<cmpnamelist.size();i++) {
		System.out.print("Unique values in given input : "+cmpnamelist.get(i));}
	}

}
