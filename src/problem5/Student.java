package problem5;

public class Student extends Person {
	
	private int yearOfStudy;
	
	public Student(String name, int age, int yearOfStudy) {
		super(name, age);
		this.yearOfStudy = yearOfStudy;
		
	}
	

	@Override
	public String getOccupation() {
		return "student at KBTU";
	}
	
	public String toString()
	{
		return String.format("Hello my name is %s, im %d years old. Im %s and my year of study is %d", getName(), getAge(), getOccupation(), yearOfStudy);
	}

}
