package corejava.assignments.Airplane;

public class ListAllPassengers {
	public static void listPassengers(String[][] seats)
	{
		for(int index=0;index<seats.length;index++)
		{
			for(String str:seats[index])
			{
				if(!str.equals("")) {
					System.out.println(str);
				}
			}
		}
	}
}
