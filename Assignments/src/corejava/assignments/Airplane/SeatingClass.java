package corejava.assignments.Airplane;

public class SeatingClass {

	public static void seating(AirplaneData plane1) {
		System.out.println("  A  B  C  D  E ");
		for (int i = 0; i < plane1.a.length; i++) {
			System.out.print((1+ i) + " ");
			for (int j = 0; j < plane1.a[i].length - 1; j++) {
				if (plane1.a[i][j].isEmpty()) {
					System.out.print(".  ");
				} else
					System.out.print("X  ");
			}
			System.out.println();
		}
	}

	public static void seating(AirplaneData plane1, int start, int end) {
		if(start<0 || end>=plane1.a.length)
		{
			System.out.println("Invalid rows");
			return;
		}
			System.out.println("  A  B  C  D  E ");
		for (int i = start; i <= end; i++) {
			System.out.print((1+ i) + " ");
			for (int j = 0; j < plane1.a[i].length - 1; j++) {
				if (plane1.a[i][j].isEmpty()) {
					System.out.print(".  ");
				} else
					System.out.print("X  ");
			}
			System.out.println();
		}
	}
}
