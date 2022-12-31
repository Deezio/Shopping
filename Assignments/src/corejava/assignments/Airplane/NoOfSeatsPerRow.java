package corejava.assignments.Airplane;

public class NoOfSeatsPerRow {
	public static void printSeatsPerRow(String[][] seats)
	{
		int seatcount;
		System.out.println("Row  SeatsFree");
		for(int i=0;i<seats.length;i++)
		{
			seatcount=0;
			for(int j=0;j<seats[i].length;j++)
			{
				if(seats[i][j].equals(""))
				{
					seatcount++;
				}
			}
			System.out.println(" "+i+"     "+(seatcount-1));
		}
	}
	
}
