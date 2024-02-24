package homeAssignments_Week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntersectionUsingList {

	public static void main(String[] args) {
		int [] arr1 = {3,2,11,4,6,7};
		int [] arr2 = {1,2,8,4,9,7};
		List<Integer> array11 = new ArrayList<Integer>();
		List<Integer> array12 = new ArrayList<Integer>();;
		//Add array values to list
		for(int i=0;i<arr1.length;i++) {

			array11.add(arr1[i]);
			array12.add(arr2[i]);
		}

		//sort the list values using collections sort
		Collections.sort(array11);
		Collections.sort(array12);

		for(int i=0;i<array11.size();i++) {

			for(int j=0;j<array12.size();j++) {

				if(array11.get(i).equals(array12.get(j))) {

					System.out.print(array11.get(i)+" ");

				}
			}
		}
	}

}
