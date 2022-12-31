package corejava.assignments.Airplane;

public class AddNames {
	public static void addName(String[][] seat,int row,int col,String name)
	{
		if((row<=0 && row>=seat.length)||(col<=0 && col>=seat[row].length)) {
			System.out.println("Invalid Seat");
		}
		else {
			if(seat[row-1][col]!="") {
				System.out.println("The seat is Booked by another passenger");
				return;
			}else {
			seat[row-1][col]=name;
			System.out.println("Name added succesfully");
			}
		}
		
	}
}
