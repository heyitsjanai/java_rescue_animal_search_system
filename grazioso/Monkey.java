
public class Monkey extends RescueAnimal {
	
	//Instance variables
	
	private String species;
	private String tailLength;
	private String height;
	private String bodyLength;
	
	//Constructor
	public Monkey(String name, String species, String gender, String age,
		    String weight, String tailLength, String height, String bodyLength, String acquisitionDate, 
		    String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry) {
		        setName(name);
		        setSpecies(species);
		        setGender(gender);
		        setAge(age);
		        setWeight(weight);
		        setTailLength(tailLength);
		        setHeight(height);
		        setBodyLength(bodyLength);
		        setAcquisitionDate(acquisitionDate);
		        setAcquisitionLocation(acquisitionCountry);
		        setTrainingStatus(trainingStatus);
		        setReserved(reserved);
		        setInServiceCountry(inServiceCountry);

		    }
	
	//Accessor methods
	public String getSpecies() {
		return species;
	}
	
	public String getTailLength() {
		return tailLength;
	}
	
	public String getHeight() {
		return height;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
	
	//Mutator methods
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	
	public void setTailLength(String tail) {
		tailLength = tail;
	}
	
	public void setHeight(String monkeyHeight) {
		height = monkeyHeight;
	}
	
	public void setBodyLength(String body) {
		bodyLength = body;
	}
}