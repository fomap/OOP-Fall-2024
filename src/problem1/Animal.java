package problem1;

import java.util.Objects;

public class Animal {
	protected String name;
	protected int age;
	
	
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String toString()
	{
		String res = "";
		res = String.format("Hello, my name is %s and I'm %d years old!", name, age);		
		return res;
		
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		 Animal animal = (Animal) o;
		 return name.equals(animal.name) && age == animal.age;
	}
	
	public int hashCode() {
	    return Objects.hash(name, age);
	}
		
		
	
	
}
