package problem5;

import java.util.Objects;

public abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age)
	{
		this.setName(name);
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String getSound();
	
	public boolean equals(Object o) {
        
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name) && age == animal.age;
    }
	
	public int hashCode() {
        return Objects.hash(name, age); 
    }
	
	public String toString() {
	    return String.format("%s the %s", getName(), getClass().getSimpleName());
	}
}
