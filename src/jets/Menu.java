package jets;

import java.util.Scanner;

public class Menu {

	public static void startUp() {
		Scanner kb = new Scanner(System.in);
		while (true) {
			System.out.println("***Welcome to the jet FLEET***");
			System.out.println("Please choose from the options below:");
			System.out.println("1. List of current jets in the FLEET");
			System.out.println("2. View the fastest jet in the FLEET");
			System.out.println("3. View the longest range jet in the FLEET");
			System.out.println("4. Add a new jet to the FLEET");
			System.out.println("5. View list of current pilots and jets they are assigned to");
			System.out.println("6. Hire a new pilot");
			System.out.println("7. Quit");
			System.out.print("Option: ");
			System.out.println("**********************************");
			System.out.println("**********************************");

			int option = kb.nextInt(); // Choose between all 5 options

			if (option == 1) {
				System.out.println("======================================");
				// listEmployees(currentemployees);
				System.out.println("======================================");
			} else if (option == 2) {
				System.out.println("======================================");
				// currentemployees = hireEmployees(currentemployees, kb);
				// listEmployees(currentemployees);
				System.out.println("======================================");
			} else if (option == 3) {
				System.out.println("======================================");
				// listEmployees(currentemployees);
				// currentemployees = fireEmployees(currentemployees, kb);
				// listEmployees(currentemployees);
				System.out.println("======================================");
			} else if (option == 4) {
				System.out.println("======================================");
				// listEmployees(currentemployees);
				// currentemployees = fireEmployees(currentemployees, kb);
				// listEmployees(currentemployees);
				System.out.println("======================================");
			} else if (option == 5) {
				System.out.println("======================================");
				// listEmployees(currentemployees);
				// currentemployees = fireEmployees(currentemployees, kb);
				// listEmployees(currentemployees);
			} else if (option == 6) {
				System.out.println("======================================");
				System.out.println("You have successfully quit the program...");
				System.out.println("======================================");
				break;
			}
		}
		kb.close();
	}

}
