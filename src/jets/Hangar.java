package jets;

import java.util.Arrays;

public class Hangar {

	private Jet[] currentJets;

	// Hangar jetHangar = new Hangar();

	public void listJets() {

		for (int i = 0; i < currentJets.length; i++) {
			if (currentJets[i] != null) {
				System.out.println(currentJets[i]);
			}
		}
	}

	public void addNewJetInHangar(Jet j) {

		Jet templist[] = new Jet[currentJets.length + 1];
		for (int i = 0; i < currentJets.length; i++) {
				templist[i] = currentJets[i];
			
			templist[(currentJets.length) - 1] = j;
			currentJets[i] = templist[i];
		}
		
	}

	
	public void listLongRangeJetInFleet() {

		// double dMax = Collections.max(ourValues.dValue);

		// double longestRange =
		// Collections.max(currentJets::getRangeInMiles)).get()
	}


	public Hangar(Jet[] currentJets) {
		super();
		this.currentJets = currentJets;
	}

	public Hangar() {
		super();
	}

	public Jet[] getCurrentJets() {
		return currentJets;
	}

	public void setCurrentJets(Jet[] currentJets) {
		this.currentJets = currentJets;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hangar [currentJets=");
		builder.append(Arrays.toString(currentJets));
		builder.append(", getCurrentJets()=");
		builder.append(Arrays.toString(getCurrentJets()));
		builder.append("]");
		return builder.toString();
	}

}










//public void defaultJets(Jet[] currentJets) {
//
//		// Jet jetOne = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000,
//		// 1_700);
//		// currentJets[0] = jetOne;
//		//
//		// Jet jetTwo = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000,
//		// 1_700);
//		// currentJets[1] = jetTwo;
//		//
//		// Jet jetThree = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000,
//		// 1_700);
//		// currentJets[2] = jetThree;
//		//
//		// Jet jetFour = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000,
//		// 1_700);
//		// currentJets[3] = jetFour;
//		//
//		// Jet jetFive = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000,
//		// 1_700);
//		// currentJets[4] = jetFive;
//		//
//		// Jet jetSix = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000,
//		// 1_700);
//		// currentJets[5] = jetSix;
//		//
//		// Jet jetSeven = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000,
//		// 1_700);
//		// currentJets[6] = jetSeven;
//		//
//		// Jet jetEight = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000,
//		// 1_700);
//		// currentJets[7] = jetEight;
//		//
//		// Jet jetNine = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000,
//		// 1_700);
//		// currentJets[8] = jetNine;
//		//
//		// Jet jetTen = new Jet("F-16 FIGHTING FALCON", 1_600, 2, 1_750_000,
//		// 1_700);
//		// currentJets[9] = jetTen;
//		//
//		// jetHangar.addJet(jetOne);
//		// jetHangar.addJet(jetTwo);
//		// jetHangar.addJet(jetThree);
//		// jetHangar.addJet(jetFour);
//		// jetHangar.addJet(jetFive);
//		// jetHangar.addJet(jetSix);
//		// jetHangar.addJet(jetSeven);
//		// jetHangar.addJet(jetEight);
//		// jetHangar.addJet(jetNine);
//		// jetHangar.addJet(jetTen);