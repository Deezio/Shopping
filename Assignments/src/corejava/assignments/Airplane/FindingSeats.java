package corejava.assignments.Airplane;

public class FindingSeats {
	public static void consecutiveSeats(String[][] seats,int noofseats)
	{
		int start=-0;
		int end=0;
		int count=0;
		int row = 0;
			
		if(noofseats>seats[0].length||noofseats<0) {
			System.out.println("Invalid no of seats");
			return;
		}
		for(int indexi=0;indexi<seats.length;indexi++)
		{
			start=0;
			end=0;
			count=0;
			if(noofseats<=(isRowEmpty(seats[indexi]))) {
				for(int indexj=0;indexj<seats[indexi].length;indexj++)
				{
					
					if(!seats[indexi][indexj].equals(""))
					{
						start=indexj+1;
						count=0;
					}
					else {
						
						count++;
					}
					if(count==noofseats)
					{
						end=indexj;
						row=indexi+1;
					}
				}
				
			}
			if(end>0)
			{
				break;
			}
		}
		for(int i=start;i<=end;i++)
		{
			System.out.print(row+"-"+(char)('A'+i)+" ");
		}
	}
	public static int isRowEmpty(String[] seats)
	{
		int count=0;
		for(String str:seats) {
			if(str.equals("")) {
				count++;
			}
		}
		return count;
	}
}
