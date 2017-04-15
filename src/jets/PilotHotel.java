package jets;

public class PilotHotel {

	PilotHotel [] currentPilots = new PilotHotel[100];
	
	
//	int[] myIntArray = new int[100];
	
	public static void listPilots(String listPilots[]) {
		for (int i = 0; i < listPilots.length; i++) {
			if (listPilots[i] != null) {
				System.out.println(listPilots[i]);
			}
		}
	}
	
}
