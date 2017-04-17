package jets;


public class Jet {

//	private String modelsOfJets[] = { "F-4 PHANTOM", "F-14 TOMCAT", "A-10 THUNDERBOLT (WARTHOG)", "F-18 HORNET",
//			"F-117 NIGHTHAWK", "F-16 FIGHTING FALCON", "F-15 STRIKE EAGLE", "F-35 LIGHTNING", "F-22 RAPTOR" };
	// private String mainWeapon;

	private String modelsOfJets;
	
	private double speedMPH; // display in Mach speed through Display Class
	private double machSpeed; // Mach 1 is MPH/Speed of Sound, Mach 2 is double the speed of sound, etc
																		
	private double priceInDollars;
	private double rangeInMiles;

	public Jet() {
		super();
	}

	public Jet(String modelsOfJets, double speedMPH, double priceInDollars, double rangeInMiles) {
		super();
		this.modelsOfJets = modelsOfJets;
		this.speedMPH = speedMPH;
		this.priceInDollars = priceInDollars;
		this.rangeInMiles = rangeInMiles;
	}

	public Jet(String modelsOfJets, double speedMPH, double machSpeed, double priceInDollars, double rangeInMiles) {
		super();
		this.modelsOfJets = modelsOfJets;
		this.speedMPH = speedMPH;
		this.machSpeed = Math.round(speedMPH / 760.5583392985);
		this.priceInDollars = priceInDollars;
		this.rangeInMiles = rangeInMiles;
	}

	public String getModelsOfJets() {
		return modelsOfJets;
	}

	public void setModelsOfJets(String modelsOfJets) {
		this.modelsOfJets = modelsOfJets;
	}

	public double getSpeedMPH() {
		return speedMPH;
	}

	public void setSpeedMPH(double speedMPH) {
		this.speedMPH = speedMPH;
	}

	public double getMachSpeed() {
		return machSpeed;
	}

	public void setMachSpeed(double machSpeed) {
		this.machSpeed = machSpeed;
	}

	public double getPriceInDollars() {
		return priceInDollars;
	}

	public void setPriceInDollars(double priceInDollars) {
		this.priceInDollars = priceInDollars;
	}

	public double getRangeInMiles() {
		return rangeInMiles;
	}

	public void setRangeInMiles(double rangeInMiles) {
		this.rangeInMiles = rangeInMiles;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet Type: ");
		builder.append(modelsOfJets);
		builder.append(", Mach Speed: ");
		builder.append(machSpeed = (Math.round((speedMPH / 760.5583392985))));
		builder.append(", Price in Dollars: ");
		builder.append(priceInDollars);
		builder.append(", Range in Miles: ");
		builder.append(rangeInMiles);
		builder.append("");
		return builder.toString();
	}
	
	

}
