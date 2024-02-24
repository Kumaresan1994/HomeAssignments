package homeAssignments_Week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text ="We learn Java basics as part of java sessions in java week1";
		String lower = text.toLowerCase();
		String replace="";
		String[] splittext = lower.split(" ");
		int count=0;
		for(int i=0;i<splittext.length-1;i++)
		{
			for(int j=i+1;j<splittext.length;j++)
			{
				if(splittext[i].equals(splittext[j]))
				{
					count++;
					replace=text.replace(splittext[j],"");
				}
			}		
		}
		if(count>0)
		{
			System.out.println(replace);
		}
	}
}
