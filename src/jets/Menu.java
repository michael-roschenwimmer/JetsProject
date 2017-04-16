package jets;

import java.util.Scanner;

public class Menu {

	Hangar hangar;
	static int counter = 0;

	public void startUp() {
		Jet[] defaultList = createDefaultListOfJets();
		hangar = new Hangar(defaultList);
		// jetHangar.defaultJets(currentJets);

		Scanner kb = new Scanner(System.in);
		while (true) {
			System.out.println("***Welcome to the JET FLEET***");
			System.out.println("Please choose from the options below:");
			System.out.println("1. List of current jets in the FLEET");
			System.out.println("2. View the fastest jet in the FLEET");
			System.out.println("3. View the longest range jet in the FLEET");
			System.out.println("4. Add a new jet to the FLEET");
			System.out.println("5. Quit");
			System.out.println("**********************************");
			System.out.println("**********************************");
			System.out.println("Enter your option here: ");

			int option = kb.nextInt(); // Choose between all 5 options

			if (option == 1) {
				System.out.println("======================================");
				
				System.out.println("***Current JET FLEET***");
				displayJets();
				// jetHangar.getCurrentJets(currentJets);
				// System.out.println(currentJets);
				
				// for(Student student: students) {
				// System.out.println(student); // Will invoke overrided
				// `toString()` method

				System.out.println("======================================");
			} else if (option == 2) {
				System.out.println("======================================");
				System.out.println("***Fastest JET in JET FLEET***");
				displayFastestJetInFleet();
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
				System.out.println("You have successfully quit the program...");
				System.out.println("======================================");
				break;
			}
		}
		kb.close();
	}

	public Jet[] createDefaultListOfJets() {
		Jet[] currentJets = new Jet[11];
		Jet jetOne = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000, 1_700);
		currentJets[0] = jetOne;

		Jet jetTwo = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000, 1_700);
		currentJets[1] = jetTwo;

		Jet jetThree = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000, 1_700);
		currentJets[2] = jetThree;

		Jet jetFour = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000, 1_700);
		currentJets[3] = jetFour;

		Jet jetFive = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000, 1_700);
		currentJets[4] = jetFive;

		Jet jetSix = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000, 1_700);
		currentJets[5] = jetSix;

		Jet jetSeven = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000, 1_700);
		currentJets[6] = jetSeven;

		Jet jetEight = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000, 1_700);
		currentJets[7] = jetEight;

		Jet jetNine = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000, 1_700);
		currentJets[8] = jetNine;

		Jet jetTen = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000, 1_700);
		currentJets[9] = jetTen;

		Jet jetEleven = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000, 1_700);
		currentJets[10] = jetEleven;

		return currentJets;

	}

	public void displayJets() {
		for (Jet jet : hangar.getCurrentJets()) {
			
			counter = counter++;
		    System.out.println(counter++ + ": " + jet.getModelsOfJets());
		}
	}

	public void displayFastestJetInFleet() {
		for (Jet jet : hangar.getCurrentJets()) {
			
		    System.out.println(jet.getModelsOfJets());
		}
	}
}