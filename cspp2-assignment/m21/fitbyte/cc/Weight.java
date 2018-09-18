public class Weight {
	private double kg;
	private double fatpercent;
	Weight(double kg, double fatpercent) {
		this.kg = kg;
		this.fatpercent = fatpercent;
	}
	public double getweight() {
		return kg;
	}
	public double getfatpercent() {
		return fatpercent;
	}
}