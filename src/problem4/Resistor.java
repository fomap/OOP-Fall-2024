package problem4;

public class Resistor extends Circuit{
	private double res; 
    private double potentialDifference;
	
	public Resistor(double res)
	{	
		this.res = res;
		this.potentialDifference = 0;
	}
	
	
	@Override
	public double getResistance() {
		return res;
	}


	@Override
	public double getPotentialDiff() {
		return potentialDifference;
	}
	
	public void setPotentialDiff(double potentialDifference) {
	    this.potentialDifference = potentialDifference;
	}
	 
	@Override
	public void applyPotentialDiff(double V) {
		setPotentialDiff(V);
		
	}



}
