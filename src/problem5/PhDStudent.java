package problem5;

public class PhDStudent extends Person{
	
	private String fieldOfStudy;
	
	public PhDStudent(String name, int age, String fieldOfStudy) {
		super(name, age);
		this.fieldOfStudy = fieldOfStudy;
	}

	@Override
	public String getOccupation() {
		return "PhDStudent at KBTU";
	}

	public void assignPet(Animal pet) 
	{
		if (pet instanceof Dog) {
			
			System.out.println("Sorry, too busy");
	    
		} 
		else 
		{
	         super.assignPet(pet);
	        
	    }
	
	}
	
	public String toString() {
	    return super.toString() + String.format(" My field of study is %s", fieldOfStudy);
	}
}
