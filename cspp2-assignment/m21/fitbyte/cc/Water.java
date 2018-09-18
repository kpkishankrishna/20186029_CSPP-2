public class Water {
	private int water;
	Water(int water) {
		this.water = water;
	}
	public void addwaterlog(int quant) {
		water += quant;
	}
	public int getwater() {
		return water;
	}
	public String toString() {
		String temp = "";
		temp = "Water "+ water;
		return temp;
	}
}