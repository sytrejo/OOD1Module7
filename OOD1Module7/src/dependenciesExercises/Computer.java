package dependenciesExercises;

public class Computer {
	
	private final String MODEL;
	private HardDrive hardDrive;
	private Memory memory;
	private final Processor PROCESSOR;
	
	
	//constructor
	public Computer(String model, HardDrive hardDrive, Memory memory, Processor processor) {
		MODEL = model;
		//variable shadowing
		//to deal with variable shadowing use the this keyword
		//the this keyword works from closest scope out. 
		this.hardDrive = hardDrive;
		this.memory = memory;
		PROCESSOR = processor;

		
	}
	//getters
	public String getModel() {
		return MODEL;
	}
	
	public HardDrive getHardDrive() {
		return hardDrive;
		
	}
	
	public Processor getProcessor() {
		return PROCESSOR;
		
	}
	
	public Memory getMemory() {
		return memory;
	}
	
	
	//setters
	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}
	
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	
	
	//methods
	public void turnOn() {
		System.out.println("system is on!");
	}
	
	public void turnOff() {
		System.out.println("system is off!");
	}
	
	//completed from diagram 
	public void getPower(PowerSource powerSource) {
		System.out.println( powerSource.supplyPower() + "watts received from power source");
		return;
	}
	
	//this method will convert the memory address to a string value
	public String toString() {
		return MODEL;
	}


}
