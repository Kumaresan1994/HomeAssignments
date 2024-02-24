package homeAssignments_Week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		String [] Companyname = {"HCL","Wipro", "Aspire Systems", "CTS"};
		List<String> CompanynameList = new ArrayList<>();

		for(int i =0;i<Companyname.length;i++) {

			CompanynameList.add(Companyname[i]);
		}

		Collections.sort(CompanynameList);

		for(int i=CompanynameList.size()-1;i>=0; i--) {

			System.out.print(CompanynameList.get(i)+",");


		}

	}}
