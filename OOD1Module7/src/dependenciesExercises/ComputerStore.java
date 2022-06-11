package dependenciesExercises;

import java.util.*;


public class ComputerStore {
	
	private Computer computer;
	
	String name;
	private ArrayList<Computer> computers = new ArrayList<Computer>();
	//private and public variables don't go into constructors
	
	
	

	

	//constructor has the same name as the class
	public ComputerStore(String name) {
		this.name = name;
		
		
		

	}
	
	//setters
	public void setName(String name) {
		this.name = name;
		
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	
	//this code will update the arraylist
	public void addComputer(Computer computer) {
		computers.add(computer);
			
	}
	
	//holds all the computers together.
	public ArrayList<Computer> getAllComputers() {
		
		return computers;
		
	}
	
	
	
	

}


