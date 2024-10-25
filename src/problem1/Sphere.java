package problem1;

public class Sphere extends Shape3D {

	private double radius;
	
	@Override
	public double volume() {
		return ((4/3) * Math.PI * radius *  radius * radius);
	}

	@Override
	public double surfaceArea() {
		return  4 * Math.PI * radius * radius;
	}

}
