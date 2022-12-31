package corejava.assignments.Airplane;

public class RandomSeating {
	public static void randomSeating(String[][] seat,int row,int col)
	{

		int newrow=(int) (Math.random()*5);
		int newcol=(int) (Math.random()*5);
		while(seat[newrow][newcol]!="")
		{
			newrow=(int) (Math.random()*5);
			newcol=(int) (Math.random()*5);
		}
		seat[newrow][newcol]=seat[row-1][col];
		System.out.println(seat[row][col]+"Randomly moved from ["+row+"-"+(char)('A'+col)+"]  to ["+(newrow+1)+"-"+(char)('A'+newcol)+"]");
		seat[row-1][col]="";
	}
}
