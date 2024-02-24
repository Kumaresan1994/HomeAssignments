package homeAssignments_Week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

		public static void main(String[] args) {
			int[] num= {1, 2, 3, 4, 10, 6, 8};
			
			List<Integer> numberList=new ArrayList<Integer>();
			//Add array values to list
			for(int i=0;i<num.length;i++)
			{
				numberList.add(num[i]);
			}
			Collections.sort(numberList);
			System.out.println(numberList);
			for(int i=0;i<numberList.size()-1;i++)
			{
				if(((numberList.get(i))+1)!=numberList.get((i+1)))
				{
					System.out.println("Missing Elements : "+(numberList.get(i)+1));
				}
			}
	}

}
