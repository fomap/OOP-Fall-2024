package problem5;

import java.util.Vector;

public class PersonRegistry {
	
	private Vector<Person> people;
	
	
	public PersonRegistry()
	{
		people = new Vector<Person>();
	}
	
	public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }
    
    public Vector<Person> findPeopleWithPets() 
    {
        Vector<Person> withPets = new Vector<>();
        for (Person person : people) 
        {
        	if (person.hasPet())
        	{
        		withPets.add(person);
            }
        }
        return withPets;
    }
    
    public Vector<Person> findPeopleWithoutPets() 
    {
        Vector<Person> withoutPets = new Vector<>();
        for (Person person : people) 
        {
        	if (!person.hasPet())
        	{
        		withoutPets.add(person);
            }
        }
        return withoutPets;
    }
    
    
//    public void printRegistry()
//    {
//       for (Person person : people) 
//       {
//           System.out.println(person);
//       }
//    }
    
    public String toString() {
        String result = "";
        for (Person person : people) 
        {
            result += person + "\n";  
        }
        return result;
    }
}
