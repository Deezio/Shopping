package corejava.assignments.Airplane;

public class SearchPassenger {
	public static void searchPassenger(String seat[][],String name)
	{
		for(int i=0;i<seat.length;i++)
		{
			for(int j=0;j<seat[i].length;j++)
			{
				if(seat[i][j].equals(name))
				{
					System.out.println("Passenger seat is present in "+(i+1)+"-"+(char)('A'+j));
					return;
				}
			}
		}
		System.out.println("Either Passenger name is incorrect or the passenger hasnt booked any seat");
	}
}
