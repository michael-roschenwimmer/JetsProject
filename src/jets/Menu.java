package jets;

import java.util.Scanner;

public class Menu {

	Hangar hangar;  // declared hangar object
	static int counter = 1;  // counter for the display list
	static Scanner kb = new Scanner(System.in);  // scanner for user input

	public void startUp() {  // method that runs the whole program
		Jet[] defaultList = createDefaultListOfJets();  
		hangar = new Hangar(defaultList); // hangar object instantiated with new Jet array placed inside

		while (true) {  // while loop instead of a switch... I don't like switches for some reason
			System.out.println("***Welcome to the JET FLEET***");
			System.out.println("**********************************");
			System.out.println();
			System.out.println("Please choose and enter one of the options below:");
			System.out.println("1. List of current JETS in the FLEET");
			System.out.println("2. View the fastest JET in the FLEET");
			System.out.println("3. View the longest range JET in the FLEET");
			System.out.println("4. Add a new JET to the FLEET");
			System.out.println("5. Quit");
			System.out.println();
			System.out.println("**********************************");
			System.out.println("**********************************");

			int option = kb.nextInt(); // Choose between all 5 options

			if (option == 1) {
				System.out.println("======================================");
				System.out.println("***Current JET FLEET***");
				displayJets();
				System.out.println("======================================");
			} else if (option == 2) {
				System.out.println("======================================");
				System.out.println("***Fastest JET in JET FLEET***");
				Jet fastest = hangar.listFastestJetInFleet();
				System.out.println(fastest);
				System.out.println("======================================");
			} else if (option == 3) {
				System.out.println("======================================");
				System.out.println("***Longest range JET in JET FLEET***");
				Jet longestRangeJet = hangar.listLongRangeJetInFleet();
				System.out.println(longestRangeJet);
				System.out.println("======================================");
			} else if (option == 4) {
				System.out.println("======================================");
				addNewJet();
				displayJets();
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
	
	public Jet[] createDefaultListOfJets() {  // pre-stored jets
		Jet[] currentJets = new Jet[11];
		Jet jetOne = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000, 1_700);
		currentJets[0] = jetOne;

		Jet jetTwo = new Jet("F-4 PHANTOM", 1_600, 2, 1_750_000, 1_700);
		currentJets[1] = jetTwo;

		Jet jetThree = new Jet("F-14 TOMCAT", 1_600, 2, 1_750_000, 1_700);
		currentJets[2] = jetThree;

		Jet jetFour = new Jet("A-10 THUNDERBOLT (WARTHOG)", 1_600, 2, 1_750_000, 1_700);
		currentJets[3] = jetFour;

		Jet jetFive = new Jet("F-18 HORNET", 1_600, 2, 1_750_000, 1_700);
		currentJets[4] = jetFive;

		Jet jetSix = new Jet("F-117 NIGHTHAWK", 1_600, 2, 1_750_000, 1_700);
		currentJets[5] = jetSix;

		Jet jetSeven = new Jet("F-15 STRIKE EAGLE", 1_600, 2, 1_750_000, 1_700);
		currentJets[6] = jetSeven;

		Jet jetEight = new Jet("F-35 LIGHTNING", 1_600, 2, 1_750_000, 1_700);
		currentJets[7] = jetEight;

		Jet jetNine = new Jet("F-22 RAPTOR", 1_600, 2, 1_750_000, 1_700);
		currentJets[8] = jetNine;

		Jet jetTen = new Jet("F-35 LIGHTNING", 1_600, 2, 1_750_000, 1_700);
		currentJets[9] = jetTen;

		Jet jetEleven = new Jet("A-10 THUNDERBOLT (WARTHOG)", 1_600, 2, 1_750_000, 1_700);
		currentJets[10] = jetEleven;

		return currentJets;

	}

	public void displayJets() {
		for (Jet jet : hangar.getCurrentJets()) { //1. List of current jets in the FLEET
			counter = counter++;
			System.out.println(counter++ + ": JET Type: " + jet.getModelsOfJets());
		}
		counter = 1;
	}

	public void displayFastestJetInFleet() { //2. View the fastest jet in the FLEET
		for (Jet jet : hangar.getCurrentJets()) {

			System.out.println(jet.getModelsOfJets());
			System.out.println(jet.getMachSpeed());
		}
	}

	public void displayLongestRangeJetInFleet() {  //3. View the longest range jet in the FLEET
		for (Jet jet : hangar.getCurrentJets()) {

			System.out.println(jet.getModelsOfJets());
			System.out.println(jet.getRangeInMiles());
		}
	}

	public void addNewJet() {  // 4. Add a new jet to the FLEET ---user adds custom jet   
	
	System.out.println("Please enter the model of the JET in all CAPS:");
	String modelsOfJets = kb.next();
	System.out.println("Please enter the speed of the JET in miles per hour (MPH):");
	double speedMPH = kb.nextDouble();
	System.out.println("Please enter the price of the JET in dollars:");
	double priceInDollars = kb.nextDouble();
	System.out.println("Please enter the range of the JET in miles:");
	double rangeInMiles = kb.nextDouble();
	
	Jet j = new Jet(modelsOfJets, speedMPH, priceInDollars, rangeInMiles);
	
	hangar.addNewJetInHangar(j);  // adds the jet to the hangar object (that has the jet array)
		}
}
	
	
