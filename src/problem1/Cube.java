package problem1;

public class Cube extends Shape3D {

	private double sideLength;
	
	@Override
	public double volume() {
		return sideLength * sideLength * sideLength;
	}

	@Override
	public double surfaceArea() {
		return 6 * (sideLength * sideLength);
	}

}
