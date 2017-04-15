package jets;

import java.util.Scanner;

public class HirePilot {

	HirePilot[] pilotsForHire = new HirePilot[100];
	
	public static String[] hirePilot(HirePilot pilotsForHire[], Scanner kb) {
		System.out.print("Name of callsign for new pilot (first only): ");
		String callsign = kb.next();
		String hireList[] = new String[pilotsForHire.length + 1];
		for (int i = 0; i < pilotsForHire.length; i++) {
			hireList[i] = new String[pilotsForHire.[i]];
		}
//		String[] names = list.toArray(new String[list.size()]);
		
		
		hireList[(hireList.length) - 1] = callsign;
		return hireList;
	}
	
//	public static String[] firePilot(String pilotsForFiring[], Scanner kb) {
//		System.out.print("Who do you want to fire? ");
//		String name = kb.next();
//		for (int i = 0; i < currentemployees.length; i++) {
//			if (name.equals(currentemployees[i])) {
//				currentemployees[i] = null;
//			}
//		}
//		return currentemployees;
//	}
//	
}
