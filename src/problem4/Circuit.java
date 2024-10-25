package problem4;

public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	public double getPower() {
		double res = getResistance();
		double volt = getPotentialDiff();
		return (volt * volt) / res;
	}
	public double getCurrent() {
		double res = getResistance();
		double volt = getPotentialDiff();
		return volt / res;
	}
}
