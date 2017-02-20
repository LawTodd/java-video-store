import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class VideoStoreApp {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {

		Scanner scanner = new Scanner(System.in);

		Movie regular = new Regular("Pirates");
		Movie childrens = new Childrens("Up");
		Movie newRelease = new NewRelease("Dr Strange");
		RentalStatement statement = new RentalStatement();

		System.out.println("Welcome to Block Buster!");
		boolean quit = false;
		int rentalDays = 0;
		while (!quit) {
			System.out.println("Please enter the type of movie you would like to rent, "
					+ "(either regular, childrens, or new), or simply quit to generate your statement:");
			String movieType = scanner.next();
			if (!movieType.equals("quit")) {
				System.out.println("Please enter the number of days you would like to rent this movie for:");
				rentalDays = scanner.nextInt();
			}

			switch (movieType) {
			case "regular":
				Rental rentalR = new Rental(regular, rentalDays);
				statement.add(rentalR);
				System.out.println("Amount due for a regular movie = " + regular.calculateFees(rentalDays)
					+ " for " + rentalDays + " days ");
				break;
			case "childrens":
				Rental rentalC = new Rental(childrens, rentalDays);
				statement.add(rentalC);
				System.out.println("Amount due for a childrens movie = " + childrens.calculateFees(rentalDays)
					+ " for " + rentalDays + " days ");
				break;
			case "new":
				Rental rentalN = new Rental(newRelease, rentalDays);
				statement.add(rentalN);
				System.out.println("Amount due for a new release movie = " + newRelease.calculateFees(rentalDays)
					+ " for " + rentalDays + " days ");
				break;
			case "quit":
				quit = true;
				break;
			default:
				System.out.println("I'm sorry I don't have that kind of movie");
				break;
			}

		}
		scanner.close();
		statement.print();

	}
}

