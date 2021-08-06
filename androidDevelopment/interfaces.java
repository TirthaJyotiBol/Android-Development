package androidDevelopment;

interface plants{
	void printPlants();
}

interface animals2{
	void printAnimals();
}


public  class interfaces implements plants,animals2 {
	 public void printPlants() {
		 System.out.println("Plant...");
	 }
	 
	 public void printAnimals(){
		 System.out.println("Animals..");
	 }
	 
	 
	 public static void main(String[]args) {
		 interfaces obj = new interfaces();
		 obj.printPlants();
		 obj.printAnimals();
	 }
		
	}








