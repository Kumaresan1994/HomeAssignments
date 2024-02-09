package homeAssignments_Week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number=8, firstTerm=0, secondTerm=1;
		
		for(int i =0;i<number;i++) {
			
			System.out.print(firstTerm+",");
			
			int nextTerm = firstTerm+secondTerm;
			firstTerm= secondTerm;
			secondTerm=nextTerm;
			
		}

	}

}
