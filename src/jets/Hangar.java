package jets;

public class Hangar {

	// Try to have an array of 100 jets or so
	
	Hangar [] currentJets = new Hangar[100];
	
	public static void listJets(String currentJets[]) {
		for (int i = 0; i < currentJets.length; i++) {
			if (currentJets[i] != null) {
				System.out.println(currentJets[i]);
			}
		}
	}
	
}
