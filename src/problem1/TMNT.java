package problem1;

import java.util.Objects;

public class TMNT extends Animal{
	

	private String weapon;
	
	public TMNT(String name, int age, String weapon) {
		super(name, age);
		this.setWeapon(weapon);
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String toString()
	{
		String res = "";
		res = String.format("Hello, my name is %s and I'm %d years old! My weapon is %s", name, age, weapon);		
		return res;
		
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		 TMNT tmnt = (TMNT) o;
		 return name.equals(tmnt.name) && age == tmnt.age && weapon.equals(tmnt.weapon) ;
	}
	
	public int hashCode() {
	    return Objects.hash(name, age, weapon);
	}
			

}
