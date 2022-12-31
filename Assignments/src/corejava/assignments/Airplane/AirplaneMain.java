package corejava.assignments.Airplane;

import java.util.Scanner;

public class AirplaneMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		AirplaneData plane1 = new AirplaneData();
		plane1.a[0][0] = "Filled";
		plane1.a[0][1] = "Filled";
		plane1.a[1][0] = "Filled";
		plane1.a[0][2] = "Filled";
		plane1.a[3][0] = "Filled";
		plane1.a[4][1] = "Filled";
		plane1.a[0][4] = "Filled";
		plane1.a[0][3] = "Filled";
		plane1.a[1][2] = "Filled";
		while (true) {
			System.out.println("\n 1.See Seating \n 2.Book a seat \n 3.Remove the Passenger \n "
					+ "4.Search pasenger seat no by their name \n 5.Count of seats in each row \n 6.searching n consicutive seats \n"
					+ " 7.Randomly relocating seats \n 8.List all passengers \n9.Exit \n please enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("1.See Default Seating \n2. See seating of Specific rows \n Enter Your choice");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					SeatingClass.seating(plane1);
					break;

				case 2:
					System.out.println("\nEnter the start and end rows  row starts from 1 ");
					int start = sc.nextInt();
					int end = sc.nextInt();
					SeatingClass.seating(plane1, start - 1, end - 1);
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;
			case 2:
				System.out.println("Enter the seat details in “[row number]-[seat character]” eg 1-A");
				sc.nextLine();
				String seat = sc.nextLine();
				String seatinfo[] = seat.split("-");
				System.out.println("Enter the Name to be assingned to the seat");
				String name = sc.nextLine();
				AddNames.addName(plane1.a, Integer.parseInt(seatinfo[0]), seatinfo[1].toUpperCase().compareTo("A"),
						name);
				break;

			case 3:
				System.out.println("Enter the seat details in “[row number]-[seat character]” eg 1-A");
				sc.nextLine();
				String seatr = sc.nextLine();
				String seatrinfo[] = seatr.split("-");
				AirplaneRemovePassenger.removePassenger(plane1.a, Integer.parseInt(seatrinfo[0]),
						seatrinfo[1].toUpperCase().compareTo("A"));
				break;

			case 4:
				System.out.println("Please Enter the name as specified while booking of the seats");
				sc.nextLine();
				name = sc.nextLine();
				SearchPassenger.searchPassenger(plane1.a, name);
				break;

			case 5:
				NoOfSeatsPerRow.printSeatsPerRow(plane1.a);
				break;

			case 6:
				System.out.println(
						"Enter the no of consecutive seats to be found `SHOULD BE LESS THAN 6 AND MORE THAN 1`");
				int noofseats = sc.nextInt();
				FindingSeats.consecutiveSeats(plane1.a, noofseats);
				break;
			case 7:
				System.out.println("Enter the seat details whoose seat has to be changes");
				sc.nextLine();
				String seatre = sc.nextLine();
				String seatreinfo[] = seatre.split("-");
				RandomSeating.randomSeating(plane1.a, Integer.parseInt(seatreinfo[0]),
						seatreinfo[1].toUpperCase().compareTo("A"));
				break;
			case 8:
				ListAllPassengers.listPassengers(plane1.a);
				break;
			case 9:
				System.out.println(
						"Thank you for flying the developer took around 4 hours to complete this initial build so be thankfull for him Dhantawaadh");
				break;
			default:
				System.out.println("Invalid choice choose again");
			}
		}

	}

}
