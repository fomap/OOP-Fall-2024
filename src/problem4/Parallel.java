package problem4;

public class Parallel extends Circuit{

	private Circuit c1;
    private Circuit c2;

    public Parallel(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
	@Override
	public double getResistance() {
		double res1 = c1.getResistance();
        double res2 = c2.getResistance();
        return 1 / ((1 / res1)  + (1 / res2));
	}

	@Override
	public double getPotentialDiff() {
		return c1.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double V) {
		c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
		
	}
	
	public double getCurrent() {
       
		 return c1.getCurrent() + c2.getCurrent();
    }
	
	
	@Override
    public double getPower() {
        return c1.getPower() + c2.getPower();
    }
}
