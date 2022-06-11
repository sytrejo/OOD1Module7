package dependenciesExercises;

public class PowerSource {
	double watts;
	
	//constructor
	public PowerSource(double watts) {
		this.watts = watts; 
	}


	public double supplyPower() {
		return watts;
		}
	

//getter
	public double getWatts() {
		return watts;
	}
	
//setter
	public double setWatts(double watts) {
		this.watts = watts;
		return watts;
	}
	

	

}
