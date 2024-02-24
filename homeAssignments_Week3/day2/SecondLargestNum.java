package homeAssignments_Week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNum {

	public static void main(String[] args) {
		int [] arr = {3, 2, 11, 4, 6, 7,12};

		List<Integer> array11 = new ArrayList<Integer>(); 
		//Add array values to list
		for(int i=0;i<arr.length;i++) {

			array11.add(arr[i]);
		}
		Collections.sort(array11); 
		Integer largest =0, secondlargest =0;

		for(int i=0;i<array11.size(); i++) {

			if( array11.get(i)>largest) { 
				secondlargest=largest;

				largest=array11.get(i);

			}} System.out.println(secondlargest);

	}

}
