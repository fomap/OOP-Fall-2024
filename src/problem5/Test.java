package problem5;

public class Test {

	public static void main(String[] args) {

		Person john = new Employee("John", 30, 100.00);
        Person alice = new PhDStudent("Alice", 26, "CS");
        Animal leonardo = new Turtle("Leonardo", 15); 

        john.assignPet(leonardo); 
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

     
        john.leavePetWith(alice);
        System.out.println(registry);
        john.retrievePetFrom(alice);
        System.out.println(registry); 
		       
	     
	}

}
