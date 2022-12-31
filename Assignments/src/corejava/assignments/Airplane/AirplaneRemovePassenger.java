package corejava.assignments.Airplane;

public class AirplaneRemovePassenger {
	public static void removePassenger(String seat[][],int row,int col)
	{
		if((row<=0 && row>=seat.length)||(col<=0 && col>=seat[row].length)) {
			System.out.println("Invalid Seat");
		}
		else {
			if(seat[row-1][col]=="") {
				System.out.println("The seat is Already empty");
				return;
			}else {
			seat[row-1][col]="";
			System.out.println("Name Removed succesfully");
			}
		}
	}
}
