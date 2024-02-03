import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)
    
    
    
    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
    	String menuSelection = "0";
      
    	initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
   
    do {
    	Driver.displayMenu();
    	System.out.println("Enter a menu selection: ");
    	menuSelection = scnr.nextLine();
    	if (menuSelection == "1") {
    		Driver.intakeNewDog(scnr);
    	}
    	else if (menuSelection == "2") {
    		Driver.intakeNewMonkey(scnr);
    	
    	}
    	else if (menuSelection == "3") {
    		Driver.reserveAnimal(scnr);
    	}
    	else if (menuSelection == "4") {
    		Driver.printDogs();
    	}
    	else if (menuSelection == "5") {
    		Driver.printMonkeys();
    	}
    	else if (menuSelection == "6") {
    		Driver.printAnimals();
    	}
    	else {
    		System.out.println("Invalid entry. Try again:");
    	}
    }while(menuSelection != "q");
    }
    

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("George", "Marmoset", "male", "2", "4.5", "7.8", "4.5", "22.6", "06-04-2022", "Africa", "intake", false, "United States");
    	
    	monkeyList.add(monkey1);

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
           System.out.println("What is the dog's breed?");
           String breed = scanner.nextLine();
           System.out.println("What is the dog's age?");
           String dogAge = scanner.nextLine();
           System.out.println("What is the dog's weight?");
           String dogWeight = scanner.nextLine();
           System.out.println("What is the dog's acquisition date?");
           String dateAcquired = scanner.nextLine();
           System.out.println("What is the dog's acquisition country?");
           String dogAcquisitionCountry = scanner.nextLine();
           System.out.println("What is the dog's training status?");
           String trainingStatus = scanner.nextLine();
           
           // For now, I have set the service status and work country manually 
           //System.out.println("What is the dog's reservation status?");
           //boolean dogReserved = scanner.nextLine();
           //System.out.println("Where is the dog currently working/training?");
           //String dogServiceCountry = scanner.nextLine();
           
           Dog dog4 = new Dog(name, breed, dogAge, dogWeight, dateAcquired, dogAcquisitionCountry, trainingStatus, dogReserved, dogServiceCountry);
           
           dogList.add(dog4);
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
    
    public static void intakeNewMonkey(Scanner scanner) {
    	System.out.println("What is the monkey's name?");
    	String name = scanner.nextLine();
    	System.out.println("What is the monkey's species?");
    	String species = scanner.nextLine();
    	System.out.println("What is the monkey's gender?");
    	String gender = scanner.nextLine();
    	System.out.println("What is the monkey's age?");
    	String age = scanner.nextLine();
    	System.out.println("What is the monkey's weight?");
    	String weight = scanner.nextLine();
    	System.out.println("What is the monkey's tail length?");
    	String tailLength = scanner.nextLine();
    	System.out.println("What is the monkey's height?");
    	String height = scanner.nextLine();
    	System.out.println("What is the monkey's body length?");
    	String bodyLength = scanner.nextLine();
    	System.out.println("What is the monkey's acquisition date?");
    	String acquisitionDate = scanner.nextLine();
    	System.out.println("What is the monkey's acquisition country?");
    	String acquisitionCountry = scanner.nextLine();
    	System.out.println("What is the monkey's training status?");
    	String trainingStatus = scanner.nextLine();
    	// not sure if we need to ask about reservation status or serviceCountry location or if that 
    	// gets set at a different time. For now I will manually set, if we need to get those inputs,
    	// I can change later. 
    	boolean reserved = false;
    	String inServiceCountry = "United States";
    	
    	Monkey monkey2 = new Monkey(name, species, gender, age, weight, tailLength, height, 
    			                    bodyLength, acquisitionDate, acquisitionCountry, 
    			                    trainingStatus, reserved, inServiceCountry);
    	monkeyList.add(monkey2);
    }
    	
        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("What type of animal would you like to reserve?");
            String animal = scanner.nextLine();
            if (animal == "monkey" || animal == "dog") {
            	System.out.println("What is the country you are in?");
            	String country = scanner.nextLine();
            }
            else {
            	System.out.println("Invalid animal. Try again");
            }
            
            	
            

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        public static void printDogs() {
        	System.out.println("Available dogs: " + dogList);
        }
        // monkey - prints the list of monkeys
        public static void printMonkeys() {
        	System.out.println("Available monkeys: " + monkeyList);
        }
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals() {
            System.out.println("All available animals: " + monkeyList + " " + dogList);

        }
}

