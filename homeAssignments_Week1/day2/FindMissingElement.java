package homeAssignments_Week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int [] input =	{1,4,3,2,8,6,7};

		Arrays.sort(input);

		for (int i = input[0]; i < input.length; i++) {

			if (i != input[i - 1]) {

				System.out.println("Missing Number: " + i);

				break;
			}
		}
	}}

