package problem5;

import java.util.Objects;

public abstract class Person {

	private String name;
	private int age;
	private Animal pet;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void assignPet(Animal pet)
	{
		this.pet = pet;
	}
	
	public void removePet()
	{
		this.pet = null;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public Animal getPet()
	{
		return pet;
	}
	
	public boolean hasPet()
	{
		return this.pet != null;
	}
	
	
	
	public abstract String getOccupation();
	
	
	public String toString()
	{
		String res = String.format("Hello my name is %s, and I'm %d years old", name, age);
		if(hasPet())
		{
			res += " I own " + pet;
		}
		return res;
		
	}
	
	public boolean equals(Object o) 
	{
                
        if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return 	name.equals(person.name) &&
				age == person.age && 
				((pet != null && pet.equals(person.pet)) ||
				(pet == null && person.pet == null));
    }
	
	public int hashCode() 
	{
        return Objects.hash(name, age, pet);
    }
	
	
	
	public void leavePetWith(Person responsible) 
	{
		if (!hasPet()) {
	        System.out.println(name + " doesn't have a pet to leave.");
	        return;
	    }
	    
	    if (responsible instanceof PhDStudent && pet instanceof Dog) {
	        System.out.println("PhD students cannot take care of dogs.");
	        return;
	    }
	    
	  
	    Animal tempPet = pet; 
	    removePet();
	    responsible.assignPet(tempPet);
	    System.out.println(name + " has left " + tempPet.getName() + " with " + responsible.getName());
    }
	
	public void retrievePetFrom(Person responsible) {
		

	  
	    if (!responsible.hasPet()) {
	        System.out.println(responsible.getName() + " doesn't have any pets.");
	        return; 
	    }

	   
	    Animal tempPet = responsible.getPet(); 
	    if (tempPet != null) {
	        responsible.removePet(); 
	        assignPet(tempPet);
	        System.out.println(name + " has retrieved " + tempPet.getName() + " from " + responsible.getName());
	    } else {
	        System.out.println("No pet found to retrieve.");
	    }
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
