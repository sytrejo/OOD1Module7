package dependenciesExercises;

public class Runner {
	private HardDrive hardDrive;
	private Processor processor;
	private Memory memory;
	private PowerSource watts;
	//this is the declaration of an object
	private ComputerStore computerStore;
	

	public static void main(String[] args) {
		
		
		

		HardDrive hardDrive1 = new HardDrive("model1", 10.2, 0);
		HardDrive hardDrive2 = new HardDrive("model2", 12.2, 0);
		Processor processor1 = new Processor("M1", 5.2, 10);
		Processor processor2 = new Processor("M2", 6.7, 15);
		Memory memory1 = new Memory("MD1", 10.1, 12.3);
		Memory memory2 = new Memory("MD2", 11.1, 14.5);
		
		PowerSource pw = new PowerSource(2.0);
		
		//this is the creation of a new objection (instantiation)
		ComputerStore name1 = new ComputerStore("Apple");
		

		
		
		//check for the powerSource in the computer constructor
		Computer computer1 = new Computer("Dell", hardDrive1, memory1, processor1);
		Computer computer2 = new Computer("Lenovo", hardDrive2,memory2, processor2);
		
		System.out.println(computer1.getModel());
		
		
		//when calling a method you need to think about what the method belongs to
		//addComputer belongs to the ComputerStore class so you call it on that
		name1.addComputer(computer1);
		name1.addComputer(computer2);
		
		System.out.println(name1.getAllComputers());

}


}
