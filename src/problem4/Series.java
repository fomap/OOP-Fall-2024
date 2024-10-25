package problem4;

public class Series extends Circuit{
	private Circuit c1;
	private Circuit c2;
	
	public Series(Circuit c1, Circuit c2)
	{
		this.c1 = c1;
		this.c2 = c2;
	}
	
	
	@Override
	public double getResistance() {
		return c1.getResistance() + c2.getResistance();	
	}

	@Override
	public double getPotentialDiff() {
		return c1.getPotentialDiff() + c2.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double V) {
		c1.applyPotentialDiff(V * (c1.getResistance() / getResistance()));
        c2.applyPotentialDiff(V * (c2.getResistance() / getResistance()));
		
	}
	
	public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }

    @Override
    public double getPower() {
 
       return c1.getPower() + c2.getPower();
    }

}
